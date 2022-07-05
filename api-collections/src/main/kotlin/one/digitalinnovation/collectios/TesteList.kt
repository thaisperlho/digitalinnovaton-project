package one.digitalinnovation.collectios

fun main() {
    val carlos = Funcionario(nome = "Carlos", salario = 3000.00)
    val ana = Funcionario(nome = "Ana", salario = 5000.00)
    val thais = Funcionario(nome = "Thais", salario = 1500.00)

    val funcionarios = listOf(carlos, ana, thais)

    funcionarios.forEach { println(it) }

    println("---------")
    println(funcionarios.find { it.nome == "Thais" })

    println("---------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()

}