
import java.util.Scanner;

/*
 * Exercício 12
 * Dados 3 valores lado1, lado2, lado3, que representam
 * os comprimentos dos lados de um triângulo, descreva
 * um algoritmo que verifique se os mesmos podem ser os
 * comprimentos dos lados de um triângulo. Em caso afirmativo,
 * verifique e informe se é "triângulo equilátero",
 * "triângulo isósceles" ou "triângulo escaleno". Em
 * caso negativo, informe que os mesmos não formam um triângulo.
 */
public class Uni4Exe12 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int lado1;
            int lado2;
            int lado3;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o lado 1: ");

                if (sc.hasNextInt()) {
                    lado1 = sc.nextInt();

                    break; // válido

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Lado 1 deve ser um inteiro!");
            }

            while (true) {
                System.out.print("Insira o lado 2: ");

                if (sc.hasNextInt()) {
                    lado2 = sc.nextInt();

                    break; // válido

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Lado 2 deve ser um inteiro!");
            }

            while (true) {
                System.out.print("Insira o lado 3: ");

                if (sc.hasNextInt()) {
                    lado3 = sc.nextInt();

                    break; // válido

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Lado 3 deve ser um inteiro!");
            }

            // Saída
            if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3
                    || lado3 >= lado1 + lado2) {
                System.out.println("Não forma um Triângulo");
            } else if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isóceles");
            } else {
                System.out.println("Escaleno");
            }
        }
    }
}
