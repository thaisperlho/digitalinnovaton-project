package one.digitalinnovation.collectios

fun main() {
    val salarios = doubleArrayOf(1200.0, 2250.0, 5000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("-------------")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2000 = salarios.filter { it > 2000.0 }
    println("-------------")
    salariosMaiorQue2000.forEach { println(it) }
}