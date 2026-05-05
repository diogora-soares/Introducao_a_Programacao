
import java.util.Scanner;

public class Uni5Exe19 {

    public static void main(String[] args) {
        double valorRecebido = 0;
        double valorDaCompra;
        double valorAPagar;
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.printf("Informe o valor da compra: ");
                valorDaCompra = sc.nextDouble();
                if (valorDaCompra == 0) {
                    break;
                }

                valorAPagar = valorDaCompra * ((valorDaCompra > 500) ? 0.80 : 0.85);

                valorRecebido += valorAPagar;
                System.out.printf("Valor a pagar: R$%.2f%n", valorAPagar);
            }
            System.out.printf("O valor total recebido foi de R$%.2f", valorRecebido);
        }
    }
}
