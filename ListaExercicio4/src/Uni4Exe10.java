
import java.util.Scanner;

/*
 * Exercício 10
 * Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha.
 * Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família
 * suponha que não haja empates.
 */
public class Uni4Exe10 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int idadeM;
            int idadeZ;
            int idadeL;

            // Entrada de dados
            while (true) {
                System.out.print("Insira a idade do Marquinhos: ");

                if (sc.hasNextInt()) {
                    idadeM = sc.nextInt();

                    if (idadeM > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Idade do Marquinhos inválida! Digite um inteiro maior que 0.");
            }

            while (true) {
                System.out.print("Insira a idade do Zezinho: ");

                if (sc.hasNextInt()) {
                    idadeZ = sc.nextInt();

                    if (idadeZ > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Idade do Zezinho inválida! Digite um inteiro maior que 0.");
            }

            while (true) {
                System.out.print("Insira a idade da Luluzinha: ");

                if (sc.hasNextInt()) {
                    idadeL = sc.nextInt();

                    if (idadeL > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Idade da Luluzinha inválida! Digite um inteiro maior que 0.");
            }

            // Saída
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
