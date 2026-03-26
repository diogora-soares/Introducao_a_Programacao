
import java.util.Scanner;

/*
 * Exercício 13
 * Escreva um algoritmo que obtém do usuário 3 valores
 * inteiros representando as três cartas deste usuário
 * em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3; 
 * 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O 
 * algoritmo deve imprimir na tela a palavra "TRUCO" 
 * (se APENAS UMA das três cartas for AS, 2 ou 3), 
 * "SEIS" (se APENAS DUAS das três cartas for AS, 2 
 * ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 
 * ou 3). Se não houver AS, 2 ou 3 nas três cartas, 
 * não é impresso nada.
 */
public class Uni4Exe13 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int carta1 = 0;
            int carta2 = 0;
            int carta3 = 0;
            int contadorCartasBoas = 0;

            // Entrada de dados
            while (true) {
                System.out.print("Insira sua primeira carta: ");

                if (sc.hasNextInt()) {
                    carta1 = sc.nextInt();

                    if (carta1 > 0 && carta1 < 14) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Carta inválida! Digite um inteiro maior que 0 e menor que 14.");
            }

            while (true) {
                System.out.print("Insira sua segunda carta: ");

                if (sc.hasNextInt()) {
                    carta2 = sc.nextInt();

                    if (carta2 > 0 && carta2 < 14) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Carta inválida! Digite um inteiro maior que 0 e menor que 14.");
            }

            while (true) {
                System.out.print("Insira sua terceira carta: ");

                if (sc.hasNextInt()) {
                    carta3 = sc.nextInt();

                    if (carta3 > 0 && carta3 < 14) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Carta inválida! Digite um inteiro maior que 0 e menor que 14.");
            }

            // Saída
            if (carta1 <= 3) {
                contadorCartasBoas++;
            }
            if (carta2 <= 3) {
                contadorCartasBoas++;
            }
            if (carta3 <= 3) {
                contadorCartasBoas++;
            }

            switch (contadorCartasBoas) {
                case 1 -> System.out.println("TRUCO");
                case 2 -> System.out.println("SEIS");
                case 3 -> System.out.println("NOVE");
            }
        }
    }
}
