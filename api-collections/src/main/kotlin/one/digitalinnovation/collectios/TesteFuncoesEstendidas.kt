package one.digitalinnovation.collectios

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "5000".toBigDecimal()
    )

    println("-----------")
    println(salarios.somatoria())

    println("-----------")
    println(salarios.media())
}