package one.digitalinnovation.collectios

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Thais"
    nomes[1] = "Carlos"
    nomes[2] = "Ana"

    for (nome in nomes) {
        println(nome)
    }
    println("----------")
    nomes.sort()
    nomes.forEach {println(it)}

    val nomes2 = arrayOf("Luis", "Pedro", "Carlos")

    println("----------")
    nomes2.sort()
    nomes2.forEach {println(it)}
}