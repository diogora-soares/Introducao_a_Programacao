
import java.util.Scanner;

public class beeCrowd1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
                System.out.println("Valores aceitos");
            } else {
                System.out.println("Valores nao aceitos");
            }
        }
    }
}
