import java.util.Scanner;

/*
 * Exercício 02
 * 
 * Objetivo:
 * Verificar se um número inteiro é par ou ímpar.
 */
public class Uni4Exe02 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int valor; // Número informado pelo usuário

            // ===== Entrada de dados =====
            while (true) {
                System.out.print("Insira o valor desejado: ");

                if (sc.hasNextInt()) {
                    valor = sc.nextInt();
                    break; // valor válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor inválido! Digite um inteiro válido.");
            }

            // ===== Processamento e Saída =====

            // Verifica se o número é divisível por 2
            if (valor % 2 == 0) {
                System.out.printf("O valor %d é par", valor);
            } else {
                System.out.printf("O valor %d é ímpar", valor);
            }
        }
    }
}