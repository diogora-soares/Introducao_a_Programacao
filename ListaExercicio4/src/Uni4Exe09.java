
import java.util.Scanner;

/*
 * Exercício 09
 * Informe dois valorem e retorne se eles são múltiplos ou não.
 */
public class Uni4Exe09 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int valor1;
            int valor2;

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

                    if (valor2 > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor2 inválido! Digite um inteiro maior que 0.");
            }

            // Saída
            if (valor1 % valor2 == 0) {
                System.out.println("Múltiplos");

            } else {
                System.out.println("Não são múltiplos ");
            }
        }
    }
}
