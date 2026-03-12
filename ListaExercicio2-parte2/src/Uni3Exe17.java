import java.util.Scanner;

public class Uni3Exe17 {
    public static void main(String[] args) {

        // Scanner para leitura de dados
        try (Scanner sc = new Scanner(System.in)) {

            // Entrada
            int qtdCamisetas;

            // Variáveis de cálculo
            double valorTotal;
            double valorDoDesconto = 0;
            double valorFinal;

            // Constantes
            final double precoCamiseta = 35;
            final double porcentagemDesconto = 0.1;

            // Leitura da quantidade de camisetas
            System.out.println("Informe quantas camisetas você deseja comprar: ");
            qtdCamisetas = sc.nextInt();

            // Validação
            while (qtdCamisetas <= 0) {
                System.err.println("Erro! Você precisa comprar mais do que 0. Tente novamente: ");
                qtdCamisetas = sc.nextInt();
            }

            // Cálculo do valor total
            valorTotal = qtdCamisetas * precoCamiseta;

            // Cálculo do desconto (10%)
            valorDoDesconto = valorTotal * porcentagemDesconto;

            // Valor final
            valorFinal = valorTotal - valorDoDesconto;

            // Saída de dados
            System.out.printf(
                "Quantidade de camisetas: %d%nValor total: R$%.2f%nDesconto aplicado: R$%.2f%nValor final: R$%.2f",
                qtdCamisetas, valorTotal, valorDoDesconto, valorFinal
            );
        }
    }
}