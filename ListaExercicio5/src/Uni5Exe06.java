
import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        double mediaAltura = 0;
        try (Scanner sc = new Scanner(System.in)){
            for (int i = 0; i < 20; i++) {
                System.out.printf("Insira a altura da %dª pessoa: ",(i+1));
                mediaAltura += sc.nextDouble();
            }
            mediaAltura /= 20;
            System.out.println("Media da altura é de: " + mediaAltura);
        }
    }
}
