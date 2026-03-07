
import java.util.Scanner;

/*
 * Exercício 06
 * Calcula o valor a pagar em um restaurante por quilo,
 * descontando o peso do prato.
 */

public class Uni3Exe06 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Variáveis
            double pesoPratoCliente;
            double valorAPagar;

            // Constantes
            final double pesoPrato = 0.75;
            final double precoKg = 25;

            // Entrada
            System.out.println("Insira o valor da pesagem: ");
            pesoPratoCliente = sc.nextDouble();

            // Processamento
            valorAPagar = (pesoPratoCliente - pesoPrato) * precoKg;

            // Saída
            System.out.println("O valor do prato do cliente é: R$" + valorAPagar);
        }
    }
}