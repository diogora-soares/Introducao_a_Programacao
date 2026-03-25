
import java.util.Scanner;

/*
 * Exercício 11
 * Escreva um algoritmo para ler o ano de nascimento de 3 irmãos,
 * escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS,
 * APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem
 * a mesma idade e o outro diferente dos demais, e apenas irmãos se 
 * todas as idades forem diferentes.
 */
public class Uni4Exe11 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int idadeIrmao1;
            int idadeIrmao2;
            int idadeIrmao3;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o ano de nascimento do primeiro irmão: ");

                if (sc.hasNextInt()) {
                    idadeIrmao1 = sc.nextInt();

                    if (idadeIrmao1 > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Ano de nascimento do primeiro irmão inválida! Digite um inteiro maior que 0.");
            }

            while (true) {
                System.out.print("Insira o ano de nascimento do segundo irmão: ");

                if (sc.hasNextInt()) {
                    idadeIrmao2 = sc.nextInt();

                    if (idadeIrmao2 > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Ano de nascimento do segundo irmão inválida! Digite um inteiro maior que 0.");
            }

            while (true) {
                System.out.print("Insira o ano de nascimento do terceiro irmão: ");

                if (sc.hasNextInt()) {
                    idadeIrmao3 = sc.nextInt();

                    if (idadeIrmao3 > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Ano de nascimento do terceiro irmão inválida! Digite um inteiro maior que 0.");
            }

            // Saída
            if (idadeIrmao1 == idadeIrmao3 && idadeIrmao1 == idadeIrmao2) {
                System.out.println("Trigemeos");
            } else if (idadeIrmao1 == idadeIrmao2 || idadeIrmao1 == idadeIrmao3 || idadeIrmao2 == idadeIrmao3) {
                System.out.println("Gêmeos");
            } else {
                System.out.println("Apenas irmãos");
            }
        }
    }
}
