
import java.util.Scanner;

/*
 * Exercício 18
 * Uma loja que trabalha com crediário funciona da 
 * seguinte maneira: se o pagamento ocorre até o 
 * dia do vencimento, o cliente ganha 10% de 
 * desconto e é avisado que o pagamento está em dia.
 * Se o pagamento é realizado até cinco dias após 
 * o vencimento o cliente perde o desconto, e se o 
 * pagamento atrasa mais de cinco dias, é cobrada 
 * uma multa de 2% por cada dia de atraso. Faça um
 * algoritmo que leia o dia do vencimento, o dia 
 * do pagamento e o valor da prestação e calcule o
 *  valor a ser pago pelo cliente, exibindo as 
 * devidas mensagens. Suponha que todo vencimento 
 * ocorre até o dia dez de cada mês e os clientes 
 * nunca deixam para pagar no mês seguinte.  
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
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Dia do vencimento deve ser maior que 0 e menor que 26!");
            }

            while (true) {
                System.out.print("Insira o dia do pagamento: ");

                if (sc.hasNextInt()) {
                    diaPagamento = sc.nextInt();
                    if (diaPagamento >= 0 && diaPagamento < 32) {
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Dia do pagamento deve ser maior que 0 e menor que 32!");
            }

            while (true) {
                System.out.print("Insira o valor da prestação: ");

                if (sc.hasNextDouble()) {
                    valorPrestacao = sc.nextDouble();
                    if (valorPrestacao > 0) {
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor da prestação deve ser maior que 0!");
            }

            // Saída
            diasAtraso = diaPagamento - diaVencimento;
            System.out.println(diasAtraso);
            if (diasAtraso <= 0) {
                if (diasAtraso <= -10) {
                    totalPrestacao = valorPrestacao - (valorPrestacao * descontoPontualidade);
                } else {
                    totalPrestacao = valorPrestacao;
                }
                System.out.printf("O pagamento está em dia. O valor da prestação é R$%.2f", totalPrestacao);
            } else {
                totalPrestacao = valorPrestacao + (valorPrestacao * multa * diasAtraso);
                System.out.printf("O pagamento atrasdo. Multa de 2%% por dia. O valor da prestação é R$%.2f",
                        totalPrestacao);
            }
        }
    }
}
