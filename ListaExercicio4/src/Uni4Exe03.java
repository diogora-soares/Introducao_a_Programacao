
import java.util.Scanner;

/*
 * Exercício 03
 * Informa o maior valor.
 */
public class Uni4Exe03 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int valor1;
            int valor2;
            int maiorValor;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o valor desejado: ");

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

            while (true) {
                System.out.print("Insira o valor desejado: ");

                if (sc.hasNextInt()) {
                    valor2 = sc.nextInt();

                    break; // Válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor2 inválido! Digite um inteiro válido.");
            }

            // Cálculo
            maiorValor = Math.max(valor1, valor2);

            // Saída
            System.out.printf("O maior valor é: %d", maiorValor);
        }
    }
}
