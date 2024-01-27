package util

import java.io.File

object FileHandler {

    fun generateOutputFile(
        content: String,
        fileDir: String = Config.OUTPUT_FOLDER,
        fileName: String = Config.FILE_NAME,
        fileExtension: String = Config.FILE_EXTENSION
    ): Boolean {
        // First handle folder.
        val canGetFolder = dirExistsOrWasCreated(fileDir)
        if (!canGetFolder) {
            println("Couldn't get folder.")
            return false
        }

        val completeFilePath = "$fileDir/$fileName$fileExtension"
        val file = File(completeFilePath)

        // Create file. If already exists -> try again with suffix.
        if (!file.createNewFile()) return generateOutputFile(content, fileDir, "$fileName (2)", fileExtension)

        println("Writing content to $completeFilePath")
        file.writeText(content)
        println("Successfully wrote content to $completeFilePath")
        return true
    }

    private fun dirExistsOrWasCreated(fileDir: String): Boolean = File(fileDir).mkdir() || File(fileDir).isDirectory
}