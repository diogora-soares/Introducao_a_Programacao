import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) {

        int numero;
        int divisor = 2;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe um número inteiro positivo: ");
            numero = sc.nextInt();

            System.out.printf("%n%-10s%-15s%n",
                    "Número",
                    "Decomposição");

            while (numero > 1) {

                if (numero % divisor == 0) {

                    System.out.printf("%-10d%-15d%n",
                            numero,
                            divisor);

                    numero = numero / divisor;

                } else {

                    divisor++;
                }
            }

            System.out.printf("%-10d%n", 1);
        }
    }
}