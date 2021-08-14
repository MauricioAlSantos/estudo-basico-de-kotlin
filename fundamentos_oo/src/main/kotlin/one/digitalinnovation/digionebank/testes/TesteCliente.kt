package one.digitalinnovation.digionebank.testes

import 
import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
//import one.digitalinnovation.digionebank.testes.TesteAutenticacao

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose.nome)

    //TesteAutenticacao().autentica(jose)
}