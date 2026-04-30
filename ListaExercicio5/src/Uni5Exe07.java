
import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {
        int n;
        double maior = -100;
        double menor = 100;
        double x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira a quantidade de números desejada: ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("Insira o %dº valor: ", (i + 1));
                x = sc.nextDouble();
                if (x > maior) {
                    maior = x;
                }
                if (x < menor) {
                    menor = x;
                }
            }
            System.out.printf("O maior valor é: %.2f %nE o menor valor é: %.2f", maior, menor);
        }
    }
}
