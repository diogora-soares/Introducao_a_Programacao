programa {
  inclua biblioteca Util --> u

  funcao inicio() {

    cadeia contaBancaria = "1234-5", contaInformada = "0"
    real saldo = 0, valor = 0
    inteiro opcao = 9

    escreva("-- A conta é '1234-5' --\n")
    escreva("Informe o número e digito da sua conta: ")
    leia(contaInformada)

    enquanto(contaInformada != contaBancaria){
      limpa()
      escreva("Conta bancária inexistente!\nTente novamente: ")
      leia(contaInformada)
    }

    enquanto (opcao != 0) {

      limpa()
      escreva("Saldo disponível: " + saldo)
      escreva("\nSelecione a opção desejada\n")
      escreva("1 - Depositar\n")
      escreva("2 - Sacar\n")
      escreva("0 - Sair\n")

      leia(opcao)
      limpa()

      escolha(opcao){

        caso 1:

          escreva("Insira o valor que deseja depositar: ")
          leia(valor)

          enquanto(valor <= 0){
            limpa()
            escreva("Saldo disponível: " + saldo)
            escreva("\nErro! Valor a ser depositado não pode ser igual ou inferior a 0\n")
            escreva("Tente novamente: ")
            leia(valor)
          }

          saldo += valor

        pare

        caso 2:

          se(saldo <= 0){
            escreva("Erro! Saldo igual ou inferior a 0 não pode realizar saque\n")
            u.aguarde(3000)
          }

          senao{

            escreva("Insira o valor que deseja sacar: ")
            leia(valor)

            enquanto(valor <= 0 ou valor > saldo){
              limpa()
              escreva("Saldo disponível: " + saldo)
              escreva("\nErro! Valor de saque não pode ser igual ou inferior a 0")
              escreva(" e também não pode ser superior ao saldo\n")
              escreva("Tente novamente: ")
              leia(valor)
            }

            saldo -= valor
          }

        pare

        caso contrario:
          escreva("Opção inválida!")
          u.aguarde(2000)
        pare
      }
    }
  }
}