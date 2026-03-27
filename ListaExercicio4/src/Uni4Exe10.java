import java.util.Scanner;

/*
 * Exercício 10
 * 
 * Objetivo:
 * Ler a idade de três filhos e identificar o caçula (mais novo).
 * 
 * Observação:
 * Não há empates.
 */
public class Uni4Exe10 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int idadeM; // Idade do Marquinhos
            int idadeZ; // Idade do Zezinho
            int idadeL; // Idade da Luluzinha

            // ===== Entrada de dados =====

            // Marquinhos
            while (true) {
                System.out.print("Insira a idade do Marquinhos: ");

                if (sc.hasNextInt()) {
                    idadeM = sc.nextInt();

                    if (idadeM > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Idade do Marquinhos inválida!");
            }

            // Zezinho
            while (true) {
                System.out.print("Insira a idade do Zezinho: ");

                if (sc.hasNextInt()) {
                    idadeZ = sc.nextInt();

                    if (idadeZ > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Idade do Zezinho inválida!");
            }

            // Luluzinha
            while (true) {
                System.out.print("Insira a idade da Luluzinha: ");

                if (sc.hasNextInt()) {
                    idadeL = sc.nextInt();

                    if (idadeL > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Idade da Luluzinha inválida!");
            }

            // ===== Processamento e Saída =====

            // Verifica quem é o mais novo
            if (idadeM <= idadeL && idadeM <= idadeZ) {
                System.out.println("Marquinhos é o caçula!");
            } else if (idadeZ <= idadeM && idadeZ <= idadeL) {
                System.out.println("Zezinho é o caçula!");
            } else {
                System.out.println("Luluzinha é a caçula!");
            }
        }
    }
}