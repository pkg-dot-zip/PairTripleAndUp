package generation

object DataClassGenerator {
    fun generateDataClassString(name: String, valueAmount: Int): String {
        var toReturn = ""

        // Add docs.
        toReturn += generateDataClassDoc(name, valueAmount)

        // Add the dataclass
        var paramString = "<"

        for (i in 1..<valueAmount + 1) {
            paramString += "out A$i,"
        }

        paramString = paramString.removeSuffix(",")
        paramString += ">"

        var valsString = "(\n"

        for (i in 1..<valueAmount + 1) {
            paramString += "public val value$i: A$i,\n"
        }

        valsString = valsString.removeSuffix(",\n")
        valsString += "\n)"

        val interfaceString = " : Serializable "

        toReturn += "public data class ${name.replaceFirstChar { it.uppercase() }}$paramString$valsString$interfaceString"

        // Give body and implement to String, including toString doc.
        toReturn += "{\n\n"

        toReturn += """ 
        /**
        * Returns string representation of the [${name.replaceFirstChar { it.uppercase() }}] including its values.
        */
        """.trimIndent()

        toReturn += "\n"

        toReturn += "public override fun toString(): String = \"("

        for (i in 1..<valueAmount + 1) {
            toReturn += "\$value$i, "
        }

        toReturn = toReturn.removeSuffix(", ")
        toReturn += ")\"\n}"

        // Outside the body, we create the toList() extension method.
        toReturn += ExtensionMethodGenerator.generateToListExtensionMethodString(name, valueAmount)

        return toReturn
    }

    private fun generateDataClassDoc(name: String, valueAmount: Int): String {
        var toReturn = ""
        val docBase = """
         /**
         * Represents $valueAmount of values
         *
         * There is no meaning attached to values in this class, it can be used for any purpose.
         * ${name.replaceFirstChar { it.uppercase() }} exhibits value semantics, i.e. two ${name + 's'} are equal if all $valueAmount components are equal.
         *
         """

        toReturn += docBase

        for (i in 1..<valueAmount) {
            toReturn += """
            * @param A$i type of the $i value.
            """.trimIndent() + "\n"
        }

        toReturn += docBase

        for (i in 1..<valueAmount) {
            toReturn += """
            * @property value$i The $i value.
            """.trimIndent() + "\n*/\n"
        }

        return toReturn
    }
}