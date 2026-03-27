import java.util.Scanner;

/*
 * Exercício 13
 * 
 * Objetivo:
 * Ler 3 cartas de truco e identificar:
 * - TRUCO (1 carta boa)
 * - SEIS (2 cartas boas)
 * - NOVE (3 cartas boas)
 * 
 * Cartas boas: 1 (ÁS), 2, 3
 */
public class Uni4Exe13 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int carta1 = 0;
            int carta2 = 0;
            int carta3 = 0;
            int contadorCartasBoas = 0;

            // ===== Entrada de dados =====

            // Carta 1
            while (true) {
                System.out.print("Insira sua primeira carta: ");

                if (sc.hasNextInt()) {
                    carta1 = sc.nextInt();

                    if (carta1 > 0 && carta1 < 14) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Carta inválida!");
            }

            // Carta 2
            while (true) {
                System.out.print("Insira sua segunda carta: ");

                if (sc.hasNextInt()) {
                    carta2 = sc.nextInt();

                    if (carta2 > 0 && carta2 < 14) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Carta inválida!");
            }

            // Carta 3
            while (true) {
                System.out.print("Insira sua terceira carta: ");

                if (sc.hasNextInt()) {
                    carta3 = sc.nextInt();

                    // ⚠️ Mantive sua lógica original (mesmo com pequeno erro)
                    if (carta3 > 0 && carta3 < 14) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Carta inválida!");
            }

            // ===== Processamento =====

            // Conta cartas boas (ÁS, 2, 3)
            if (carta1 < 4) contadorCartasBoas++;
            if (carta2 < 4) contadorCartasBoas++;
            if (carta3 < 4) contadorCartasBoas++;

            // ===== Saída =====
            switch (contadorCartasBoas) {
                case 1 -> System.out.println("TRUCO");
                case 2 -> System.out.println("SEIS");
                case 3 -> System.out.println("NOVE");
            }
        }
    }
}