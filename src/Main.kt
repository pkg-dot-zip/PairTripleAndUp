import generation.DataClassGenerator
import generation.ImportGenerator
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

    outputString += ImportGenerator.generateImportString()
    outputString += "\n\n\n"

    for ((name, valueAmount) in map) {
        outputString += DataClassGenerator.generateDataClassString(name, valueAmount)
        outputString += "\n"
    }

    // Write file.
    FileHandler.generateOutputFile(outputString)

    // End
    println("Exiting program.")
}

/**
 *  Checks if no duplicates.
 */
private fun isValidTupleMap(map: Map<String, Int>): Boolean =
    map.values.groupingBy { it }.eachCount().any { it.value > 1 }