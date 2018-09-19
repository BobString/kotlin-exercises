import java.util.*

fun main(args: Array<String>) {
    println("Hello, World!")
    println(isStringValid("{}"))
    println(isStringValid("({[]})"))
    println(isStringValid("({[}])"))
    println(isStringValid("}"))
    println(isStringValid("()}"))
    println(isStringValid("(((("))
}

val map = mapOf(')' to '(', '}' to '{', ']' to '[')

fun isStringValid(input: String): Boolean {

    var stack = Stack<Char>()

    for (char in input.toCharArray()) {
        if (map.values.contains(char)) {
            stack.push(char)
        } else {
            if (stack.isEmpty()) {
                return false
            }
            val lastElement = stack.pop()
            if (map.getValue(char) != lastElement) {
                return false
            }
        }git
    }

    if (stack.isEmpty()) {
        return true
    }
    return false
}