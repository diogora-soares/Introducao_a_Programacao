import java.util.Scanner;

/*
 * Exercício 19
 * Identifica o quadrante de um ponto (x, y)
 */
public class Uni4Exe19 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int x;
            int y;

            // Entrada de dados (validação para X)
            while (true) {
                System.out.print("Insira o X: ");

                if (sc.hasNextInt()) {
                    x = sc.nextInt();
                    break; // valor válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("X deve ser inteiro!");
            }

            // Entrada de dados (validação para Y)
            while (true) {
                System.out.print("Insira o Y: ");

                if (sc.hasNextInt()) {
                    y = sc.nextInt();
                    break; // valor válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Y deve ser inteiro!");
            }

            // Saída - verificação dos quadrantes
            if (x == 0 && y == 0) {
                System.out.println("Quadrante 0");
            } else if (x > 0 && y > 0) {
                System.out.println("Quadrante 1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante 2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrante 3");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrante 4");
            }
        }
    }
}