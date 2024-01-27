package generation

object ExtensionMethodGenerator {
    fun generateToListExtensionMethodString(name: String, valueAmount: Int): String {
        var toReturn = ""

        val docBase = """ 
        /**
        * Converts this $name into a list.
        */
        """.trimIndent()

        toReturn += "$docBase\n"

        var genericString = "<"
        for (i in 0..<valueAmount) {
            genericString += "T, "
        }
        genericString = genericString.removeSuffix(", ")
        genericString += ">"

        var valueString = ""
        for (i in 1..<valueAmount + 1) {
            valueString += "value$i, "
        }

        valueString = valueString.removeSuffix(", ")

        toReturn += "fun <T> ${name.replaceFirstChar { it.uppercase() }}$genericString.toList(): List<T> = listOf($valueString)"

        return toReturn
    }
}