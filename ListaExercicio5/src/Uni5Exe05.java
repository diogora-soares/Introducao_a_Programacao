import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) {
        int n;
        int x = 8;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.printf("Insira o número de termos que você quer: ");
                n = sc.nextInt();
            } while (n <= 2);
            for (int i = 0; i < n; i++) {
                System.out.println(x);
                if (i % 2 == 0) {
                    x += 2;
                } else {
                    x = (x - 2) * 2;
                }
            }
        }
    }
}