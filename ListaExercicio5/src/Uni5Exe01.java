
import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x;
            for (int i = 0; i < 20; i++) {
                System.out.println("Insira o " + (i+1) + "º número: ");
                x = sc.nextInt();
                if (x % 2 == 0) {
                    System.out.println("Par");
                } else {
                    System.out.println("Ímpar");
                }
            }
            System.out.println("Programa finalizado");
        }
    }
}
