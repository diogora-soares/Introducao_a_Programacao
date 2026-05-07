
import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {
        int n;
        double maior;
        double menor;
        double x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira a quantidade de números desejada: ");
            n = sc.nextInt();
            System.out.printf("Insira o 1º valor: ");
            x = sc.nextDouble();
            maior = x;
            menor = x;
            for (int i = 1; i < n; i++) {
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
