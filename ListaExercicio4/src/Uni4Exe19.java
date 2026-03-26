
import java.util.Scanner;

/*
 * Exercício 19
 * Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado  
 * > 0, se os dois valores forem zero  
 * > 1, se os dois valores forem positivos  
 * > 2, se o x for negativo e o y, positivo 
 * > 3, se os dois valores forem negativos  
 * > 4, se o x for positivo e o y, negativo
 */
public class Uni4Exe19 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int x;
            int y;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o X: ");

                if (sc.hasNextInt()) {
                    x = sc.nextInt();
                    break; // válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("X deve ser inteiro!");
            }

            while (true) {
                System.out.print("Insira o Y: ");

                if (sc.hasNextInt()) {
                    y = sc.nextInt();
                    break; // válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Y deve ser inteiro!");
            }

            // Saída
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
