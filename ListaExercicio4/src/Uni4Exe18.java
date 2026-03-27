import java.util.Scanner;

/*
 * Exercício 18
 * Regras:
 * - Até o vencimento → 10% de desconto
 * - Até 5 dias após → sem desconto e sem multa
 * - Mais de 5 dias → multa de 2% por dia de atraso
 */
public class Uni4Exe18 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int diaVencimento;
            int diaPagamento;
            double valorPrestacao;
            double totalPrestacao;
            final double multa = 0.02;
            final double descontoPontualidade = 0.10;
            int diasAtraso;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o dia do vencimento: ");

                if (sc.hasNextInt()) {
                    diaVencimento = sc.nextInt();
                    if (diaVencimento > 0 && diaVencimento < 26) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Dia do vencimento deve ser maior que 0 e menor que 26!");
            }

            while (true) {
                System.out.print("Insira o dia do pagamento: ");

                if (sc.hasNextInt()) {
                    diaPagamento = sc.nextInt();
                    if (diaPagamento > 0 && diaPagamento < 32) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Dia do pagamento deve ser maior que 0 e menor que 32!");
            }

            while (true) {
                System.out.print("Insira o valor da prestação: ");

                if (sc.hasNextDouble()) {
                    valorPrestacao = sc.nextDouble();
                    if (valorPrestacao > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor da prestação deve ser maior que 0!");
            }

            // Processamento
            diasAtraso = diaPagamento - diaVencimento;

            // Saída
            if (diasAtraso <= 0) {
                // Pagamento em dia ou antecipado → ganha desconto
                totalPrestacao = valorPrestacao - (valorPrestacao * descontoPontualidade);
                System.out.printf("Pagamento em dia! Valor com desconto: R$%.2f", totalPrestacao);

            } else if (diasAtraso <= 5) {
                // Até 5 dias de atraso → sem desconto e sem multa
                totalPrestacao = valorPrestacao;
                System.out.printf("Pagamento com pequeno atraso. Valor normal: R$%.2f", totalPrestacao);

            } else {
                // Mais de 5 dias → aplica multa por dia
                totalPrestacao = valorPrestacao + (valorPrestacao * multa * diasAtraso);
                System.out.printf("Pagamento atrasado! Multa aplicada. Valor: R$%.2f", totalPrestacao);
            }
        }
    }
}