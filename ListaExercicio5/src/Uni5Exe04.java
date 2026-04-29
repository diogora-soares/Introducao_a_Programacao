
import java.util.Scanner;

public class Uni5Exe04 {
    public static void main(String[] args) {
        double denominador = 3;
        double numerador = 2;
        double s = 0;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 20; i++) {
                s = denominador/numerador;
                numerador += denominador;
                denominador += 2;
            }
            System.out.println("Resultado: "+s);
        }
    }
}
