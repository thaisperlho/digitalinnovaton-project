package one.digitalinnovation.collectios

fun main() {
    val carlos = Funcionario(nome = "Carlos", salario = 3000.00, tipoContratacao = "CLT")
    val ana = Funcionario(nome = "Ana", salario = 5000.00, tipoContratacao = "PJ")
    val thais = Funcionario(nome = "Thais", salario = 1500.00, tipoContratacao = "CLT")

    println("------------List------------")
    val funcionarios = mutableListOf(carlos, thais)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.add(ana)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.remove(carlos)
    funcionarios.forEach { println(it) }

    println("------------Set------------")
    val funcionarioSet = mutableSetOf(carlos)
    funcionarioSet.forEach { println(it) }

    println("------------")
    funcionarioSet.add(ana)
    funcionarioSet.add(thais)
    funcionarioSet.forEach { println(it) }

    println("------------")
    funcionarioSet.remove(ana)
    funcionarioSet.forEach { println(it) }




}