
import java.util.Scanner;

/*
 * Exercício 10
 * Calcula a hipotenusa de um triângulo retângulo
 * utilizando o Teorema de Pitágoras.
 */

public class Uni3Exe10 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Variáveis
            double cateto1;
            double cateto2;
            double hipotenusa;

            // Entrada
            System.out.println("Insira o primeiro cateto: ");
            cateto1 = sc.nextDouble();

            System.out.println("Insira o segundo cateto: ");
            cateto2 = sc.nextDouble();

            // Processamento
            hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
            hipotenusa = Math.sqrt(hipotenusa);

            // Saída
            System.out.printf("A hipotenusa é: %.2f", hipotenusa);
        }
    }
}