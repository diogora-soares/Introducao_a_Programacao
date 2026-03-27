import java.util.Scanner;

/*
 * Exercício 12
 * 
 * Objetivo:
 * Verificar se três valores podem formar um triângulo e,
 * em caso positivo, identificar seu tipo:
 * - Equilátero (todos os lados iguais)
 * - Isósceles (dois lados iguais)
 * - Escaleno (todos diferentes)
 */
public class Uni4Exe12 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int lado1;
            int lado2;
            int lado3;

            // ===== Entrada de dados =====

            // Lado 1
            while (true) {
                System.out.print("Insira o lado 1: ");

                if (sc.hasNextInt()) {
                    lado1 = sc.nextInt();
                    break; // válido
                } else {
                    sc.next();
                }

                System.err.println("Lado 1 deve ser um inteiro!");
            }

            // Lado 2
            while (true) {
                System.out.print("Insira o lado 2: ");

                if (sc.hasNextInt()) {
                    lado2 = sc.nextInt();
                    break;
                } else {
                    sc.next();
                }

                System.err.println("Lado 2 deve ser um inteiro!");
            }

            // Lado 3
            while (true) {
                System.out.print("Insira o lado 3: ");

                if (sc.hasNextInt()) {
                    lado3 = sc.nextInt();
                    break;
                } else {
                    sc.next();
                }

                System.err.println("Lado 3 deve ser um inteiro!");
            }

            // ===== Processamento e Saída =====

            // Verifica se forma triângulo (regra: soma de dois lados > terceiro)
            if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
                lado1 >= lado2 + lado3 ||
                lado2 >= lado1 + lado3 ||
                lado3 >= lado1 + lado2) {

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