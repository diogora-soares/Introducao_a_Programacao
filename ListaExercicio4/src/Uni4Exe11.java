import java.util.Scanner;

/*
 * Exercício 11
 * 
 * Objetivo:
 * Ler o ano de nascimento de três irmãos e identificar:
 * - Trigêmeos (todos iguais)
 * - Gêmeos (dois iguais)
 * - Apenas irmãos (todos diferentes)
 */
public class Uni4Exe11 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int irmao1;
            int irmao2;
            int irmao3;

            // ===== Entrada de dados =====

            // Irmão 1
            while (true) {
                System.out.print("Insira o ano de nascimento do primeiro irmão: ");

                if (sc.hasNextInt()) {
                    irmao1 = sc.nextInt();

                    if (irmao1 > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor inválido!");
            }

            // Irmão 2
            while (true) {
                System.out.print("Insira o ano de nascimento do segundo irmão: ");

                if (sc.hasNextInt()) {
                    irmao2 = sc.nextInt();

                    if (irmao2 > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor inválido!");
            }

            // Irmão 3
            while (true) {
                System.out.print("Insira o ano de nascimento do terceiro irmão: ");

                if (sc.hasNextInt()) {
                    irmao3 = sc.nextInt();

                    if (irmao3 > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor inválido!");
            }

            // ===== Processamento e Saída =====

            // Verifica os casos
            if (irmao1 == irmao2 && irmao1 == irmao3) {
                System.out.println("Trigêmeos");
            } else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
                System.out.println("Gêmeos");
            } else {
                System.out.println("Apenas irmãos");
            }
        }
    }
}