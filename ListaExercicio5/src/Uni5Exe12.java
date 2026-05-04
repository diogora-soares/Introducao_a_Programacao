import java.util.Scanner;

public class Uni5Exe12 {

    public static void main(String[] args) {
        int numeroLinhas;
        int numero = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira o número desejado: ");
            numeroLinhas = sc.nextInt();
            for (int linha = 1; linha <= numeroLinhas; linha++) {
                for (int col = 1; col <= linha; col++) {
                    if (col < linha) {
                        System.out.printf("%d ", numero);
                    } else {
                        System.out.printf("%d", numero);
                    }
                    numero++;
                }
                System.out.printf("%n");
            }
        }
    }
}