import java.util.Scanner;

/*
 * Exercício 05
 * 
 * Objetivo:
 * Ler um valor booleano e responder "Sim" ou "Não".
 */
public class Uni4Exe05 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            boolean azul; // Indica se a resposta é verdadeira ou falsa

            // ===== Entrada de dados =====
            while (true) {
                System.out.printf("A cor é azul?: ");

                if (sc.hasNextBoolean()) {
                    azul = sc.nextBoolean();
                    break; // valor válido
                } else {
                    sc.next(); // limpa entrada inválida
                    System.err.println("Valor inválido! Digite true ou false.");
                }
            }

            // ===== Saída =====

            // Operador ternário para resposta direta
            System.out.printf(azul ? "Sim" : "Não");
        }
    }
}