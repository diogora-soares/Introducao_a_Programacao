
import java.util.Scanner;

/*
 * Exercício 02
 * Calcula o desconto de 12% aplicado a um produto.
 */

public class Uni3Exe02 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double precoPadrao;
            final double porcentagemDesconto = 0.12;
            double precoComDesconto;
            double valorDesconto;

            // Entrada
            System.out.println("Insira o preço do produto sem desconto: ");
            precoPadrao = sc.nextDouble();

            // Processamento
            valorDesconto = precoPadrao * porcentagemDesconto;
            precoComDesconto = precoPadrao - valorDesconto;

            // Saída
            System.out.println("O valor do desconto é de R$" + valorDesconto);
            System.out.println("O preço do par de sapatos com desconto é R$" + precoComDesconto);
        }
    }
}