programa {
  funcao inicio() {
    cadeia nomeProduto
    real precoProduto,qtdGenerica, qtdProduto //Variavel qtdProduto declarada como real pois dependendo o produto pode ser vendido a granel (kg,m,chapa,L,etc...)
    inteiro opcao
    

    escreva("Insira o nome do produto: ")
    leia(nomeProduto)
    limpa()
    escreva("Insira o preço do produto: ")
    leia(precoProduto)
    limpa()
    escreva("Insira o quantidade do produto: ")
    leia(qtdProduto)
    limpa()
    
    enquanto (opcao != 0)
    {
      escreva("Informe a opção desejada \n1 - Adicionar " + nomeProduto + " ao estoque \n2 - Diminuir " + nomeProduto + " do estoque \n3 - Apresentar valor do estoque \n0 - Sair\n")
      leia(opcao)
      escolha(opcao){
        caso 1:
          escreva("Insira a quantidade que deseja adicionar: ")
          leia(qtdGenerica)
          enquanto(qtdGenerica <= 0){
            escreva("Erro! Valor igual ou inferior a 0. Tente novamente: ")
            leia(qtdGenerica)
          }
          qtdProduto = qtdProduto + qtdGenerica
        pare

        caso 2:
          escreva("Insira a quantidade que deseja deduzir: ")
          leia(qtdGenerica)
          enquanto(qtdGenerica <= 0){
            escreva("Erro! Valor igual ou inferior a 0. Tente novamente: ")
            leia(qtdGenerica)
          }
          qtdProduto = qtdProduto - qtdGenerica
        pare

        caso 3:
          escreva("|\tNome\t|\tQtd\t|\tPreço Un\t|\n"+
                  "+-------------------------------------+\n"+
                  "|\t"+nomeProduto+"\t|\t"+qtdProduto+"\t|\t"+precoProduto+"\t|\n"+
                  "+-------------------------------------+\n"+
                  "|\tValor Total do estoque\t|\t"+ (precoProduto*qtdProduto)+"\t|\n"+
                  "+-------------------------------------+\n")
        pare
      }
    }
  }
}
