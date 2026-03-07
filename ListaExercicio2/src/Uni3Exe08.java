
import java.util.Scanner;

/*
 * Exercício 08
 * Converte um valor em dólares para reais.
 */

public class Uni3Exe08 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Variáveis
            double precoDolar;
            double valorDolar;
            double valorReais;

            // Entrada
            System.out.println("Insira o preço do dólar: ");
            precoDolar = sc.nextDouble();

            System.out.println("Insira a quantidade de dólares: ");
            valorDolar = sc.nextDouble();

            // Processamento
            valorReais = valorDolar * precoDolar;

            // Saída
            System.out.printf("O atendente deve devolver R$%.2f para o cliente", valorReais);
        }
    }
}