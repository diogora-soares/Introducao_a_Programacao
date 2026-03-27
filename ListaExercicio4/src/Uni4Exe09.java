import java.util.Scanner;

/*
 * Exercício 09
 * 
 * Objetivo:
 * Ler dois valores inteiros e verificar se são múltiplos.
 */
public class Uni4Exe09 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int valor1; // Primeiro número
            int valor2; // Segundo número

            // ===== Entrada de dados =====

            // Leitura do primeiro valor
            while (true) {
                System.out.print("Insira o primeiro valor: ");

                if (sc.hasNextInt()) {
                    valor1 = sc.nextInt();

                    if (valor1 > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor1 inválido! Digite um inteiro maior que 0.");
            }

            // Leitura do segundo valor
            while (true) {
                System.out.print("Insira o segundo valor: ");

                if (sc.hasNextInt()) {
                    valor2 = sc.nextInt();

                    if (valor2 > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor2 inválido! Digite um inteiro maior que 0.");
            }

            // ===== Processamento e Saída =====

            // Verifica se valor1 é múltiplo de valor2
            if (valor1 % valor2 == 0) {
                System.out.println("Múltiplos");
            } else {
                System.out.println("Não são múltiplos");
            }
        }
    }
}