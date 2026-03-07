programa {
  funcao inicio() {
    real base,altura
    escreva("Insira a base do retângulo: ")
    leia(base)
    escreva("Insira a altura do retângulo: ")
    leia(altura)
    limpa()

    escreva("A área do seu retângulo é: " + (base*altura) + "\nE o perimetro é: " + ((base + altura)*2))
  }
}