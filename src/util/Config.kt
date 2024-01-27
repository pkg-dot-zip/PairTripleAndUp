package util

object Config {
    const val OUTPUT_FOLDER = "HorrorDir"
    const val FILE_NAME = "HorrorOutput"
    const val FILE_EXTENSION = ".kt"
    const val GENERATE_DOC = false

    fun getMapOfTerror(): Map<String, Int> = map

    // Data from: https://simple.wikipedia.org/wiki/Tuple_names
    private val map: Map<String, Int> = mapOf(
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
}