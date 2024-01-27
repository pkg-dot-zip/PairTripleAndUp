package util

import java.io.File

object FileHandler {
    fun generateOutputFile(fileDir: String, fileName: String, content: String): Boolean {
        // First handle folder.
        val canGetFolder = dirExistsOrWasCreated(fileDir)
        if (!canGetFolder) {
            println("Couldn't get folder.")
            return false
        }

        val completeFilePath = fileDir + "/" + fileName + Config.FILE_EXTENSION
        val file = File(completeFilePath)

        // Create file. If already exists -> try again with suffix.
        if (!file.createNewFile()) return generateOutputFile(fileDir, "$fileName (2)", content)

        println("Writing content to $completeFilePath")
        file.writeText(content)
        println("Successfully wrote content to $completeFilePath")
        return true
    }

    private fun dirExistsOrWasCreated(fileDir: String): Boolean = File(fileDir).mkdir() || File(fileDir).isDirectory
}