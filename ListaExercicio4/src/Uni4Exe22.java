import java.util.Scanner;

/*
 * Exercício 22
 * Escolha de curso e exibição do título
 */
public class Uni4Exe22 {

    public static void main(String[] args) {

        int escolha;

        try (Scanner sc = new Scanner(System.in)) {

            // Menu e validação
            while (true) {
                System.out.printf("1 – Ciência da Computação%n2 – Licenciatura da Computação%n3 – Sistemas de Informação%n");

                if (sc.hasNextInt()) {
                    escolha = sc.nextInt();

                    if (escolha > 0 && escolha < 4) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.out.println("Escolha entre 1 e 3");
            }

            // Saída
            switch (escolha) {
                case 1 -> System.out.println("Bacharel em Ciência da Computação");
                case 2 -> System.out.println("Licenciado em Computação");
                case 3 -> System.out.println("Bacharel em Sistemas de Informação");
            }
        }
    }
}