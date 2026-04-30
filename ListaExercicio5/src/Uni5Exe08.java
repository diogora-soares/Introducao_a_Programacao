
import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
        int n;
        int mediaPositivos = 0;
        int menorNegativo = 0;
        int contaPositivo = 0;
        int valor;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira a quantidade de números desejada: ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("Insira o %dº valor: ", (i + 1));
                valor = sc.nextInt();
                if (valor > 0) {
                    mediaPositivos += valor;
                    contaPositivo++;
                } else if (valor < menorNegativo) {
                    menorNegativo = valor;
                }
            }
            mediaPositivos = mediaPositivos / contaPositivo;
            System.out.printf("A média dos números positvos é: %d %nE o menor número negativo é: %d", mediaPositivos, menorNegativo);
        }
    }
}
