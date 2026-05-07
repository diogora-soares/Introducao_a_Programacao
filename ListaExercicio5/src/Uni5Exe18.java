
import java.util.Scanner;

public class Uni5Exe18 {

    public static void main(String[] args) {
        int totalPessoas = 0;
        int canal;
        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;
        int numeroPessoas;
        double porcentagem4;
        double porcentagem5;
        double porcentagem9;
        double porcentagem12;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.printf("Informe o canal: ");
            canal = sc.nextInt();

            while (canal != 0) {
                System.out.printf("Informe o número de pessoas: ");
                numeroPessoas = sc.nextInt();

                totalPessoas += numeroPessoas;
                switch (canal) {
                    case 4 ->
                        canal4 += numeroPessoas;
                    case 5 ->
                        canal5 += numeroPessoas;
                    case 9 ->
                        canal9 += numeroPessoas;
                    case 12 ->
                        canal12 += numeroPessoas;
                }

                System.out.printf("Informe o canal: ");
                canal = sc.nextInt();
            }
            if (totalPessoas > 0) {
                porcentagem4 = (canal4 * 100.0) / totalPessoas;
                porcentagem5 = (canal5 * 100.0) / totalPessoas;
                porcentagem9 = (canal9 * 100.0) / totalPessoas;
                porcentagem12 = (canal12 * 100.0) / totalPessoas;

                System.out.printf("Percentual de audiência do canal 4: %.2f%% %n", porcentagem4);
                System.out.printf("Percentual de audiência do canal 5: %.2f%% %n", porcentagem5);
                System.out.printf("Percentual de audiência do canal 9: %.2f%% %n", porcentagem9);
                System.out.printf("Percentual de audiência do canal 12: %.2f%% %n", porcentagem12);
            } else {
                System.out.println("Nenhum dado informado.");
            }
        }
    }
}
