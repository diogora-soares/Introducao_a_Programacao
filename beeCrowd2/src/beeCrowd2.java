
import java.util.Scanner;

public class beeCrowd2 {
    public static void main(String[] args) {
        double a;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextDouble();

            if (a < 0 || a > 100) {
                System.out.println("Fora de intervalo");
            } else if (a <= 25) {
                System.out.println("Intervalo [0,25]");
            } else if (a <= 50) {
                System.out.println("Intervalo (25,50]");
            } else if (a <= 75) {
                System.out.println("Intervalo (50,75]");
            } else {
                System.out.println("Intervalo (75,100]");
            }
        }
    }
}
