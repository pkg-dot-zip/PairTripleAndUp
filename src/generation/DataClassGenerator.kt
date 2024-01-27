package generation

import util.Config

object DataClassGenerator {
    fun generateDataClassString(
        name: String,
        valueAmount: Int,
        generateDoc: Boolean = true,
        generateToString: Boolean = true,
        generateToList: Boolean = true,
        implementInterface: Boolean = true
    ): String {
        var toReturn = ""

        // Add docs.
        if (generateDoc) toReturn += generateDataClassDoc(name, valueAmount)


        // Add the dataclass
        val parametersString = generateParametersString(valueAmount)
        val valuesString = generateValuesString(valueAmount)
        val interfaceString = generateInterfaceImplementationString()

        toReturn += "data class "
        toReturn += name.replaceFirstChar { it.uppercase() }
        toReturn += parametersString
        toReturn += valuesString
        if (implementInterface) toReturn += interfaceString

        // Give body and implement to String, including toString doc.
        if (generateToString) toReturn += generateDataClassBody(name, valueAmount, generateDoc)

        // Outside the body, we create the toList() extension method.
        if (generateToList) {
            toReturn += ExtensionMethodGenerator.generateToListExtensionMethodString(
                name,
                valueAmount,
                generateDoc
            )
        }

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
            valsString += "val value$i: A$i,\n"
        }

        valsString = valsString.removeSuffix(",\n")
        valsString += "\n)"
        return valsString
    }

    private fun generateDataClassBody(name: String, valueAmount: Int, generateDoc: Boolean = true): String {
        var classBody = " {\n\n"

        if (generateDoc) {
            classBody += """ 
            /**
            * Returns string representation of the [${name.replaceFirstChar { it.uppercase() }}] including its values.
            */
            """.trimIndent()
        }

        classBody += "\n"

        classBody += "override fun toString(): String = \"("

        for (i in 1..<valueAmount + 1) {
            classBody += "\$value$i, "
        }

        classBody = classBody.removeSuffix(", ")
        classBody += ")\"\n}\n"
        return classBody
    }

    private fun generateInterfaceImplementationString(): String = " : Serializable"

    private fun generateDataClassDoc(name: String, valueAmount: Int): String {
        var toReturn = ""
        val docBase = """
         /**
         * Represents $valueAmount values
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

        for (i in 1..<valueAmount) {
            toReturn += """
            * @property value$i The $i value.
            """.trimIndent() + "\n"
        }

        toReturn += "*/\n"
        return toReturn
    }
}