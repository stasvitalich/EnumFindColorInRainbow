enum class Rainbow () {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET
}

fun main() {
    val color = readln().uppercase()

    fun findColorInRainbow(color: String): Boolean {
        for (enum in Rainbow.values()) {
            if (enum.name == color) return true
        }
        return false
    }

    print(findColorInRainbow(color))
}