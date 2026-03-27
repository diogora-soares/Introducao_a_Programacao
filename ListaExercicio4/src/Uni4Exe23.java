import java.util.Scanner;

/*
 * Exercício 23
 * Converte número do mês para nome
 */
public class Uni4Exe23 {

    public static void main(String[] args) {

        int mes;

        try (Scanner sc = new Scanner(System.in)) {

            // Entrada
            System.out.println("Insira o mês desejado: ");

            while (true) {
                if (sc.hasNextInt()) {
                    mes = sc.nextInt();
                    break;
                } else {
                    sc.next();
                }

                System.out.println("Mes deve ser inteiro");
            }

            // Saída
            switch (mes) {
                case 1 -> System.out.println("Janeiro");
                case 2 -> System.out.println("Fevereiro");
                case 3 -> System.out.println("Março");
                case 4 -> System.out.println("Abril");
                case 5 -> System.out.println("Maio");
                case 6 -> System.out.println("Junho");
                case 7 -> System.out.println("Julho");
                case 8 -> System.out.println("Agosto");
                case 9 -> System.out.println("Setembro");
                case 10 -> System.out.println("Outubro");
                case 11 -> System.out.println("Novembro");
                case 12 -> System.out.println("Dezembro");
                default -> System.out.println("Valor inválido");
            }
        }
    }
}