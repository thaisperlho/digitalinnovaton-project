package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val carlos = Analista( nome = "Carlos", cpf = "123.123.123-40", salario = 2000.00)
    ImprimeRelatorioFuncionario.imprime(carlos)
}