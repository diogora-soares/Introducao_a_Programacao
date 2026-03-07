programa {
  funcao inicio() {
  cadeia modeloVeiculo
  real capacidadeTanque,kmRodados,restoCombustivel

  escreva("Insira o modelo do veículo: ")
  leia(modeloVeiculo)
  limpa()
  escreva("Insira a capacidade do tanque: ")
  leia(capacidadeTanque)
  limpa()
  enquanto(capacidadeTanque<=0){
    escreva("Erro! Capacidade do tanque não pode ser igual ou inferior a 0: ")
    leia(capacidadeTanque)
    limpa()
  }
  escreva("Insira quanto restou de combustível: ")
  leia(restoCombustivel)
  limpa()
  enquanto(restoCombustivel<0 ou restoCombustivel >= capacidadeTanque){
    escreva("Erro! Restante do combustível não pode ser inferior a 0 nem igual ou superior a "+ capacidadeTanque +": ")
    leia(restoCombustivel)
    limpa()
  }
  escreva("Insira a quantidade de Km rodados: ")
  leia(kmRodados)
  limpa()
  enquanto(kmRodados<=0){
    escreva("Erro! Km rodados não pode ser igual ou inferior a 0: ")
    leia(capacidadeTanque)
    limpa()
  }

  escreva("O veículo "+modeloVeiculo+" saiu para uma viagem com "+capacidadeTanque+"L de combustível e rodou por "+kmRodados+"km restando "+restoCombustivel+"L de combustível.\n"+
          "Sua média de consumo foi de "+ (kmRodados / (capacidadeTanque - restoCombustivel))+"km/L")

  }
}
