import java.util.Scanner;

/*
 * Exercício 24
 * Ordenação de 3 valores conforme opção
 */
public class Uni4Exe24 {

    public static void main(String[] args) {

        int valor1;
        int valor2;
        int valor3;
        int escolha;
        int maior;
        int meio;
        int menor;

        try (Scanner sc = new Scanner(System.in)) {

            // Entrada dos valores
            while (true) {
                System.out.println("Insira o valor 1: ");
                if (sc.hasNextInt()) {
                    valor1 = sc.nextInt();
                    break;
                } else {
                    sc.next();
                }
                System.out.println("Valor 1 deve ser inteiro");
            }

            while (true) {
                System.out.println("Insira o valor 2: ");
                if (sc.hasNextInt()) {
                    valor2 = sc.nextInt();
                    break;
                } else {
                    sc.next();
                }
                System.out.println("Valor 2 deve ser inteiro");
            }

            while (true) {
                System.out.println("Insira o valor 3: ");
                if (sc.hasNextInt()) {
                    valor3 = sc.nextInt();
                    break;
                } else {
                    sc.next();
                }
                System.out.println("Valor 3 deve ser inteiro");
            }

            // Menu
            while (true) {
                System.out.println("1 - crescente");
                System.out.println("2 - decrescente");
                System.out.println("3 - maior no meio");

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

            // Determinação de maior e menor
            maior = Math.max(valor1, Math.max(valor2, valor3));
            menor = Math.min(valor1, Math.min(valor2, valor3));

            // Determinação do valor do meio
            if (valor1 != maior && valor1 != menor) {
                meio = valor1;
            } else if (valor2 != maior && valor2 != menor) {
                meio = valor2;
            } else {
                meio = valor3;
            }

            // Saída
            switch (escolha) {
                case 1 -> System.out.printf("%d %d %d", menor, meio, maior);
                case 2 -> System.out.printf("%d %d %d", maior, meio, menor);
                case 3 -> System.out.printf("%d %d %d", meio, maior, menor);
            }
        }
    }
}