
import java.util.Scanner;

/**
 * Exercício 11
 * Converte uma temperatura de Celsius para Fahrenheit.
 */
public class Uni3Exe11 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double celsius;      // temperatura em graus Celsius
            double fahrenheit;   // temperatura convertida

            System.out.println("Insira a temperatura em C°: ");
            celsius = sc.nextDouble();

            // Fórmula de conversão
            fahrenheit = ((9.0 / 5.0) * celsius) + 32;

            System.out.printf("A temperatura convertida é F° %.2f", fahrenheit);
        }
    }
}