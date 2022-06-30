package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val carlos = Analista( nome = "Carlos", cpf = "123.123.123-40", salario = 2000.00)
    ImprimeRelatorioFuncionario.imprime(carlos)
}