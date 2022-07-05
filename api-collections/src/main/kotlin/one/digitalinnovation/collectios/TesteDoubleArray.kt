package one.digitalinnovation.collectios

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 7000.0
    salarios[2] = 800.0

    salarios.forEach { println(it) }

    println("--------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("--------")
    val salarios2 = doubleArrayOf(1400.0, 1350.0, 3000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}