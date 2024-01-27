package generation

object DataClassGenerator {
    fun generateDataClassString(name: String, valueAmount: Int): String {
        var toReturn = ""

        // Add docs.
        toReturn += generateDataClassDoc(name, valueAmount)

        // Add the dataclass
        val parametersString = generateParametersString(valueAmount)
        val valuesString = generateValuesString(valueAmount)
        val interfaceString = generateInterfaceImplementationString()

        toReturn += "public data class "
        toReturn += name.replaceFirstChar { it.uppercase() }
        toReturn += parametersString
        toReturn += valuesString
        toReturn += interfaceString

        // Give body and implement to String, including toString doc.
        toReturn += generateDataClassBody(name, valueAmount)

        // Outside the body, we create the toList() extension method.
        toReturn += ExtensionMethodGenerator.generateToListExtensionMethodString(name, valueAmount)

        return toReturn
    }

    private fun generateParametersString(valueAmount: Int): String {
        var paramString = "<"

        for (i in 1..<valueAmount + 1) {
            paramString += "out A$i, "
        }

        paramString = paramString.removeSuffix(", ")
        paramString += ">"
        return paramString
    }

    private fun generateValuesString(valueAmount: Int): String {
        var valsString = "(\n"

        for (i in 1..<valueAmount + 1) {
            valsString += "public val value$i: A$i,\n"
        }

        valsString = valsString.removeSuffix(",\n")
        valsString += "\n)"
        return valsString
    }

    private fun generateDataClassBody(name: String, valueAmount: Int): String {
        var classBody = "{\n\n"

        classBody += """ 
        /**
        * Returns string representation of the [${name.replaceFirstChar { it.uppercase() }}] including its values.
        */
        """.trimIndent()

        classBody += "\n"

        classBody += "public override fun toString(): String = \"("

        for (i in 1..<valueAmount + 1) {
            classBody += "\$value$i, "
        }

        classBody = classBody.removeSuffix(", ")
        classBody += ")\"\n}"
        return classBody
    }

    private fun generateInterfaceImplementationString(): String = ": Serializable"

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