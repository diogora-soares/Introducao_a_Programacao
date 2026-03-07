programa {
  funcao inicio() {
    real num1, num2
    escreva ("Insira o primeiro número: ")
    leia(num1)
    escreva ("Insira o segundo número: ")
    leia(num2)
    limpa()
    escreva ("Soma: "+ (num1 + num2) + "\nSubtração: " + (num1 - num2) + "\nMultiplicação: " + (num1 * num2))  
    se(num2 == 0){
      escreva("\nNão há como dividir por 0")
    }senao{
      escreva("\nDivisão: " + (num1/num2))
    }
  }
}
