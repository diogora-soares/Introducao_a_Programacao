
import java.util.Scanner;

/*
 * Exercício 04
 * Calcula a média ponderada de três notas.
 */

public class Uni3Exe04 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double nota01;
            double nota02;
            double nota03;

            final double peso01 = 0.5;
            final double peso02 = 0.3;
            final double peso03 = 0.2;

            double mediaPonderada;

            // Entrada
            System.out.println("Insira a primeira nota: ");
            nota01 = sc.nextDouble();

            System.out.println("Insira a segunda nota: ");
            nota02 = sc.nextDouble();

            System.out.println("Insira a terceira nota: ");
            nota03 = sc.nextDouble();

            // Processamento
            mediaPonderada = (nota01 * peso01) + (nota02 * peso02) + (nota03 * peso03);

            // Saída
            System.out.println("Sua média ponderada é: " + mediaPonderada);
        }
    }
}