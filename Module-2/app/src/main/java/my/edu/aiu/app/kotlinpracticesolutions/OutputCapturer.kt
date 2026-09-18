package my.edu.aiu.app.kotlinpracticesolutions

import java.io.ByteArrayOutputStream
import java.io.PrintStream

object OutputCapturer {
    fun capture(block: () -> Unit): String {
        val originalOut = System.out
        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        
        System.setOut(printStream)
        try {
            block()
        } finally {
            System.setOut(originalOut)
        }
        
        return outputStream.toString()
    }
}