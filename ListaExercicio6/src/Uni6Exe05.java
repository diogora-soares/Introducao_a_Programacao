/*
    Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça 
    cada um respondeu um questionário com 5 perguntas, como por exemplo:

- Gosta de música sertaneja?
- Gosta de futebol?
- Gosta de seriados?
- Gosta de redes sociais?
- Gosta da Oktoberfest?

A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

- se ambos deram a mesma resposta soma-se 3 pontos ao índice;
- se um respondeu IND e o outro SIM ou NÃO soma-se 1;
- se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.

Crie  um  vetor  para  armazenar  as  respostas  do  rapaz  e  outro  para  armazenar  as respostas da moça. Crie um método que possa ler tanto as 
respostas do rapaz como da moça, e outro para calcular e retornar  a  afinidade.  Por  fim, escreva  a  afinidade  considerando  os  seguintes 
intervalos:

| Afinidade | Mensagem                          |
|-----------|-----------------------------------|
| 15        | “Casem!                           |
| 10 a 14   | “Vocês têm muita coisa em comum!” |
| 5 a 9     | “Talvez não dê certo :(”          |
| 0 a 4     | “Vale um encontro.”               |
| -1 a -9   | “Melhor não perder tempo”         |
| -10       | “Vocês se odeiam!”                |
 */

import java.util.Scanner;

public class Uni6Exe05 {

    public static void main(String[] args) {
        String[] perguntas = {"música sertaneja", "futebol", "seriados", "redes sociais", "Oktoberfest"};
        char[] respostasRapaz;
        char[] respostasMoca;
        int indiceAfinidade;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Perguntas para o rapaz: ");
            respostasRapaz = lerRepostas(sc, perguntas);

            System.out.println("Perguntas para a moça: ");
            respostasMoca = lerRepostas(sc, perguntas);

            indiceAfinidade = calcularIndiceAfinidade(respostasRapaz, respostasMoca);

            exibirResultado(indiceAfinidade);
        }
    }

    public static char[] lerRepostas(Scanner sc, String[] perguntas) {

        char[] respostas = new char[perguntas.length];
        System.out.println("Responda apenas com (SIM, NÃO ou IND)");

        for (int idx = 0; idx < perguntas.length; idx++) {

            System.out.printf("Gosta de %s?", perguntas[idx]);
            respostas[idx] = sc.nextLine().toUpperCase().charAt(0);

            while (respostas[idx] != 'S' && respostas[idx] != 'N' && respostas[idx] != 'I') {

                System.err.println("Erro! resposta inválida.");
                System.out.println("Responda apenas com (SIM, NÃO ou IND)");
                System.out.printf("Gosta de %s? ", perguntas[idx]);
                respostas[idx] = sc.nextLine().toUpperCase().charAt(0);
            }
        }

        return respostas;
    }

    public static int calcularIndiceAfinidade(char[] respostasRapaz, char[] respostasMoca) {
        int indiceAfinidade = 0;
        for (int idx = 0; idx < respostasRapaz.length; idx++) {
            if (respostasRapaz[idx] == respostasMoca[idx]) {
                indiceAfinidade += 3;
            } else if (respostasRapaz[idx] == 'I' || respostasMoca[idx] == 'I') {
                indiceAfinidade += 1;
            } else {
                indiceAfinidade -= 2;
            }
        }

        return indiceAfinidade;
    }

    public static void exibirResultado(int indiceAfinidade) {
        if (indiceAfinidade == 15) {
            System.out.printf("Indice de afinidade: %d | Casem!", indiceAfinidade);
        } else if (indiceAfinidade >= 10) {
            System.out.printf("Indice de afinidade: %d | Vocês têm muita coisa em comum!", indiceAfinidade);
        } else if (indiceAfinidade >= 5) {
            System.out.printf("Indice de afinidade: %d | Talvez não dê certo :(", indiceAfinidade);
        } else if (indiceAfinidade >= 0) {
            System.out.printf("Indice de afinidade: %d | Vale um encontro.", indiceAfinidade);
        } else if (indiceAfinidade >= -9) {
            System.out.printf("Indice de afinidade: %d | Melhor não perder tempo.", indiceAfinidade);
        } else {
            System.out.printf("Indice de afinidade: %d | Vocês se odeiam!", indiceAfinidade);
        }
    }
}