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


    println("-------------")
    println(salarios.count { it in 2000.0..5500.0 })

    println("-------------")
    println(salarios.find { it == 2250.0})
    println(salarios.find { it == 250.0})

    println("-------------")
    println(salarios.any { it == 1200.0})
    println(salarios.any { it == 200.0})

}