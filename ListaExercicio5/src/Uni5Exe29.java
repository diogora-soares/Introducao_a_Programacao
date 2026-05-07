import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) {

        int valor;

        int cedulas20;
        int cedulas10;
        int cedulas5;
        int cedulas2;
        int cedulas1;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o valor do saque: ");
            valor = sc.nextInt();

            cedulas20 = valor / 20;
            valor = valor % 20;

            cedulas10 = valor / 10;
            valor = valor % 10;

            cedulas5 = valor / 5;
            valor = valor % 5;

            cedulas2 = valor / 2;
            valor = valor % 2;

            cedulas1 = valor;

            System.out.printf("%n--- CÉDULAS ---%n");

            if (cedulas20 > 0) {
                System.out.printf("%d cédula(s) de R$20%n",
                        cedulas20);
            }

            if (cedulas10 > 0) {
                System.out.printf("%d cédula(s) de R$10%n",
                        cedulas10);
            }

            if (cedulas5 > 0) {
                System.out.printf("%d cédula(s) de R$5%n",
                        cedulas5);
            }

            if (cedulas2 > 0) {
                System.out.printf("%d cédula(s) de R$2%n",
                        cedulas2);
            }

            if (cedulas1 > 0) {
                System.out.printf("%d cédula(s) de R$1%n",
                        cedulas1);
            }
        }
    }
}