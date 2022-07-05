package one.digitalinnovation.collectios

fun main() {
    val carlos = Funcionario(nome = "Carlos", salario = 3000.00, tipoContratacao = "CLT")
    val ana = Funcionario(nome = "Ana", salario = 5000.00, tipoContratacao = "PJ")
    val thais = Funcionario(nome = "Thais", salario = 1500.00, tipoContratacao = "CLT")

    val funcionarios = listOf(carlos, ana, thais)

    funcionarios.forEach { println(it) }

    println("---------")
    println(funcionarios.find { it.nome == "Thais" })

    println("---------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()

}