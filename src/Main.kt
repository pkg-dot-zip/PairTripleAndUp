import generation.DataClassGenerator
import util.Config
import util.FileHandler

/**
 * THIS WAS CREATED AS A JOKE!!!
 *
 * Please do NOT use in production.
 */
fun main() {
    println("Running program.")

    val map = Config.getMapOfTerror()

    if (isValidTupleMap(map)) {
        println("Quiting program since map was not valid.")
        return
    }

    // Generate file content.
    var outputString = ""
    for ((name, valueAmount) in map) {
        outputString += DataClassGenerator.generateDataClassString(name, valueAmount)
        outputString += "\n"
    }

    // Write file.
    FileHandler.generateOutputFile(Config.OUTPUT_FOLDER, Config.FILE_NAME, outputString)

    // End
    println("Exiting program.")
}

/**
 *  Checks if no duplicates.
 */
private fun isValidTupleMap(map: Map<String, Int>): Boolean {
    return map.values.groupingBy { it }.eachCount().any { it.value > 1 }
}