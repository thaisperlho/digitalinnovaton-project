package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente


fun main() {
    val thais = Gerente( nome = "Thais", cpf = "123.123.123-40", salario = 5000.00)
    ImprimeRelatorioFuncionario.imprime(thais)
}