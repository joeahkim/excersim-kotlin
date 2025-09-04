object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()

        return when {
            trimmed.isEmpty() -> "Fine. Be that way!"
            isShouting(trimmed) && trimmed.endsWith("?") -> "Calm down, I know what I'm doing!"
            isShouting(trimmed) -> "Whoa, chill out!"
            trimmed.endsWith("?") -> "Sure."
            else -> "Whatever."
        }
    }

    private fun isShouting(text: String): Boolean {
        return text.any { it.isLetter() } && text == text.uppercase()
    }
}

fun main() {
    println(Bob.hey("HOW ARE YOU?"))
    println(Bob.hey("HOW ARE YOU"))
    println(Bob.hey("Are you okay?"))
    println(Bob.hey("Hello there"))
    println(Bob.hey("   "))
}

