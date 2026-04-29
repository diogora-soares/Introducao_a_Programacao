
import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) {
        double contador = 0;
        try (Scanner sc = new Scanner(System.in)) {
            for (double i = 1; i <= 100; i++){
                contador += (1/i);
            }
            System.out.println(contador);
        }
    }
}
