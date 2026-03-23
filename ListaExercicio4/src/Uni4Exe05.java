
import java.util.Scanner;

/*
 * Exercício 05
 * Responde Sim ou Não com base em um boolean.
 */
public class Uni4Exe05 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            boolean azul;

            // Entrada de dados
            while (true) {
                System.out.printf("A cor é azul?: ");

                if (sc.hasNextBoolean()) {
                    azul = sc.nextBoolean();
                    break; // válido
                } else {
                    sc.next(); // limpa entrada inválida
                    System.err.println("Valor inválido! Digite true ou false.");
                }
            }

            // Saída
            System.out.printf(azul ? "Sim" : "Não");
        }
    }
}
