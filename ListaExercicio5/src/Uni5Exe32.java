import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {

        int p;
        int n;

        int dia = 1;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o dia da semana do primeiro dia do mês (1=Domingo ... 7=Sábado): ");
            p = sc.nextInt();

            System.out.print("Informe a quantidade de dias do mês: ");
            n = sc.nextInt();

            System.out.printf("%n D   S   T   Q   Q   S   S%n");

            // espaços antes do primeiro dia
            for (int i = 1; i < p; i++) {
                System.out.printf("    ");
            }

            // imprime os dias do mês
            while (dia <= n) {

                System.out.printf("%-4d", dia);

                // quebra linha ao completar semana
                if ((dia + p - 1) % 7 == 0) {
                    System.out.println();
                }

                dia++;
            }
        }
    }
}