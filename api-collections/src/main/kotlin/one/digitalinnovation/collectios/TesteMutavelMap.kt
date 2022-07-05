package one.digitalinnovation.collectios

fun main() {
    val carlos = Funcionario(nome = "Carlos", salario = 3000.00, tipoContratacao = "CLT")
    val ana = Funcionario(nome = "Ana", salario = 5000.00, tipoContratacao = "PJ")
    val thais = Funcionario(nome = "Thais", salario = 1500.00, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(carlos.nome, carlos)
    repositorio.create(ana.nome, ana)
    repositorio.create(thais.nome, thais)

    println(repositorio.findById(carlos.nome))

    println("-----------")
    repositorio.fundAll().forEach { println(it) }

    println("-----------")
    repositorio.remove(ana.nome)
    repositorio.fundAll().forEach { println(it) }
    
}