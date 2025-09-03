fun twofer(name: String = "you"): String {
    
    return "One for $name, one for me."
}

fun main() {
    println(twofer()) // Output: One for you, one for me.
    println(twofer("Alice")) // Output: One for Alice, one for me.
    println(twofer("Bob")) // Output: One for Bob, one for me.
}