package util

import java.io.File

object FileHandler {
    fun generateOutputFile(filePath: String, content: String) {
        val completeFilePath = filePath + Config.FILE_EXTENSION
        val file = File(completeFilePath)

        // Create file. If already exists -> try again with suffix.
        if (!file.createNewFile()) return generateOutputFile("$filePath (2)", content)

        println("Writing content to $completeFilePath")
        file.writeText(content)
        println("Successfully wrote content to $completeFilePath")
    }
}