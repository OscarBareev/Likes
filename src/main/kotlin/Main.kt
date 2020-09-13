fun main() {
    var likes: Int = 61

    var likeStr: String = likes.toString()

    if (likeStr[likeStr.lastIndex].toString() == "1") {
        println("$likeStr человеку")
    } else {
        println("$likeStr людям")
    }
}