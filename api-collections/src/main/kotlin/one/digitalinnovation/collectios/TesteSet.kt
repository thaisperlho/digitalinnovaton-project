package one.digitalinnovation.collectios

fun main() {
    val carlos = Funcionario(nome = "Carlos", salario = 3000.00, tipoContratacao = "CLT")
    val ana = Funcionario(nome = "Ana", salario = 5000.00, tipoContratacao = "PJ")
    val thais = Funcionario(nome = "Thais", salario = 1500.00, tipoContratacao = "CLT")

    val funcionarios1 = setOf(carlos, ana)
    val funcionarios2 = setOf(thais)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("---------")
    val funcionarios3 = setOf(carlos, ana, thais)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("---------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}