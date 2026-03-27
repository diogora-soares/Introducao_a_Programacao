import java.util.Scanner;

/*
 * Exercício 03
 * 
 * Objetivo:
 * Ler dois valores inteiros e informar qual é o maior.
 */
public class Uni4Exe03 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int valor1;     // Primeiro valor
            int valor2;     // Segundo valor
            int maiorValor; // Resultado

            // ===== Entrada de dados =====

            // Leitura do primeiro valor (deve ser maior que 0)
            while (true) {
                System.out.print("Insira o valor desejado: ");

                if (sc.hasNextInt()) {
                    valor1 = sc.nextInt();

                    if (valor1 > 0) {
                        break; // valor válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor1 inválido! Digite um inteiro maior que 0.");
            }

            // Leitura do segundo valor
            while (true) {
                System.out.print("Insira o valor desejado: ");

                if (sc.hasNextInt()) {
                    valor2 = sc.nextInt();
                    break; // valor válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor2 inválido! Digite um inteiro válido.");
            }

            // ===== Processamento =====

            // Utiliza função pronta para encontrar o maior valor
            maiorValor = Math.max(valor1, valor2);

            // ===== Saída =====
            System.out.printf("O maior valor é: %d", maiorValor);
        }
    }
}