import java.io.File

/**
 * THIS WAS CREATED AS A JOKE!!!
 *
 * Please do NOT use in production.
 */
const val FILE_NAME = "HorrorOutput"
const val FILE_EXTENSION = ".kt"

fun main() {
    println("Running program.")

    // Data from: https://simple.wikipedia.org/wiki/Tuple_names
    val map: Map<String, Int> = mapOf(
        Pair("quadruple", 4),   // quad / tetrad / quartet
        Pair("quintuple", 5),
        Pair("sextuple", 6),    // hextuple / hexad
        Pair("septuple", 7),
        Pair("octuple", 8),     // octa / octet / octad/octo
        Pair("nonuple", 9),
        Pair("decuple", 10),    // deka / cent
        Pair("undecuple", 11),  // hendecuple / hendecad
        Pair("duodecuple", 12),
        Pair("tredecuple", 13), // baker's dozen
        Pair("quattuordecuple", 14), // double septuple
        Pair("quindecuple", 15), // triple quintiple
        Pair("sexdecuple", 16), // quadruple quadruple
        Pair("septendecuple", 17),
        Pair("octodecuple", 18),
        Pair("novemdecuple", 19),
        Pair("vigintuple", 20), //	quadruple quintuple
        Pair("trigintuple", 30),
        Pair("quadragintuple", 40),
        Pair("quinquagintuple", 50),
        Pair("sexagintuple", 60),
        Pair("septuagintuple", 70),
        Pair("octogintuple", 80),
        Pair("nonagintuple", 90),
        Pair("centuple", 100),
        Pair("ducentuple", 200),
        Pair("trecentuple", 300),
        Pair("quadringentuple", 400),
        Pair("quingentuple", 500),
        Pair("sescentuple", 600),
        Pair("septingentuple", 700),
        Pair("octingentuple", 800),
        Pair("nongentuple", 900),
        Pair("milluple", 1000), // A lot
    )

    if (isValidTupleMap(map)) {
        println("Quiting program since map was not valid.")
        return
    }

    // Generate file content.
    var outputString = ""
    for ((name, valueAmount) in map) {
        outputString += generateDataClassString(name, valueAmount)
        outputString += "\n"
    }

    // Write file.
    generateOutputFile(FILE_NAME, outputString)

    // End
    println("Exiting program.")
}

fun generateOutputFile(filePath: String, content: String) {
    val completeFilePath = filePath + FILE_EXTENSION
    val file = File(completeFilePath)

    // Create file. If already exists -> try again with suffix.
    if (!file.createNewFile()) return generateOutputFile("$filePath (2)", content)

    println("Writing content to $completeFilePath")
    file.writeText(content)
    println("Successfully wrote content to $completeFilePath")
}

fun isValidTupleMap(map: Map<String, Int>): Boolean {
    // Checks if no duplicates.
    return map.values.groupingBy { it }.eachCount().any { it.value > 1 }
}

private fun generateDataClassString(name: String, valueAmount: Int): String {
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
    toReturn += generateToListExtensionMethodString(name, valueAmount)

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

private fun generateToListExtensionMethodString(name: String, valueAmount: Int): String {
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

    toReturn += "public fun <T> Triple$genericString.toList(): List<T> = listOf($valueString)"

    return toReturn
}