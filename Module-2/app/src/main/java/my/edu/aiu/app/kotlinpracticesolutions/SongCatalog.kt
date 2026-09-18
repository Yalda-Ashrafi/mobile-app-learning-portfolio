package my.edu.aiu.app.kotlinpracticesolutions

class Song(val title: String, val artist: String, val yearPublished: Int, val playCount: Int) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun songCatalogMain() {
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()
    println("Is popular? ${brunoSong.isPopular}")
}
