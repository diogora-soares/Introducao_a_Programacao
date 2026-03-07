
import java.util.Scanner;

/**
 * Exercício 13
 * Calcula o valor necessário para azulejar uma parede.
 */
public class Uni3Exe13 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double altura;
            double comprimento;
            double metrosQuadrados;
            double valorTotal;

            final double precoAzulejo = 12.50;

            System.out.println("Insira a altura da parede: ");
            altura = sc.nextDouble();

            System.out.println("Insira o comprimento da parede: ");
            comprimento = sc.nextDouble();

            // cálculo da área da parede
            metrosQuadrados = altura * comprimento;

            // cálculo do valor total
            valorTotal = metrosQuadrados * (9 * precoAzulejo);

            System.out.printf("O valor final é R$ %.2f", valorTotal);
        }
    }
}