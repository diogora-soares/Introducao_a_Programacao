
import java.util.Scanner;

/*
 * Exercício 09
 * Calcula o volume de uma lata de óleo (cilindro).
 */

public class Uni3Exe09 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Variáveis
            double raio;
            double altura;
            double volume;

            // Constante
            final double pi = 3.14159;

            // Entrada
            System.out.println("Insira o raio: ");
            raio = sc.nextDouble();

            System.out.println("Insira a altura: ");
            altura = sc.nextDouble();

            // Processamento
            volume = (pi * (raio * raio)) * altura;

            // Saída
            System.out.printf("O volume da lata de óleo é: %.2f", volume);
        }
    }
}