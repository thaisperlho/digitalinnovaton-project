package one.digitalinnovation.collectios

fun main() {
    val values = intArrayOf(2, 3, 4, 10, 13, 5)

    values.forEach {
        println(it)
    }

    println("----------")
    values.sort()
    values.forEach {
        println(it)
    }
}