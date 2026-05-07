
import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
        int n;
        double somaPositivos = 0;
        int menorNegativo = Integer.MAX_VALUE;
        int contaPositivo = 0;
        boolean temNegativo = false;
        int valor;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira a quantidade de números desejada: ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.printf("Insira o %dº valor: ", (i + 1));
                valor = sc.nextInt();
                if (valor > 0) {
                    somaPositivos += valor;
                    contaPositivo++;
                } else if (valor < 0) {
                    temNegativo = true;
                    if (valor < menorNegativo) {
                        menorNegativo = valor;
                    }
                }
            }
            if (contaPositivo > 0) {
                System.out.printf("A média dos números positivos é: %.2f %n", somaPositivos / contaPositivo);
            } else {
                System.out.println("Nenhum número positivo informado.");
            }
            if (temNegativo) {
                System.out.printf("E o menor número negativo é: %d", menorNegativo);
            } else {
                System.out.println("Nenhum número negativo informado.");
            }
        }
    }
}
