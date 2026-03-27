import java.util.Scanner;

/*
 * Exercício 15
 * 
 * Objetivo:
 * Determinar o percentual de reajuste salarial com base
 * no tempo de empresa (em meses).
 */
public class Uni4Exe15 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int meses;

            // ===== Entrada de dados =====
            while (true) {
                System.out.print("Insira quantos meses de empresa: ");

                if (sc.hasNextInt()) {
                    meses = sc.nextInt();

                    if (meses >= 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor inválido!");
            }

            // ===== Saída =====
            if (meses <= 12) {
                System.out.println("O funcionário irá receber 5% de reajuste");
            } else if (meses <= 48) {
                System.out.println("O funcionário irá receber 7% de reajuste");
            } else {
                System.out.println("Reajuste não informado");
            }
        }
    }
}