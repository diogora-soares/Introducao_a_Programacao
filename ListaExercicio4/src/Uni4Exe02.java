
import java.util.Scanner;

/*
 * Exercício 02
 * Descobre se um inteiro é ímpar ou par.
 */
public class Uni4Exe02 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int valor;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o valor desejado: ");

                if (sc.hasNextInt()) {
                    valor = sc.nextInt();

                    break; // Válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor inválido! Digite um inteiro válido.");
            }

            // Saída
            if (valor % 2 == 0) {
                System.out.printf("O valor %d é par", valor);
            } else {
                System.out.printf("O valor %d é ímpar", valor);
            }
        }
    }
}
