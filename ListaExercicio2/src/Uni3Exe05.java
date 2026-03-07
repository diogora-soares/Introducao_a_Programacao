
import java.util.Scanner;

/*
 * Exercício 05
 * Calcula o custo total para marcar frangos.
 */

public class Uni3Exe05 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int qtdFrango;

            final double precoAnelChip = 4;
            final double precoAnelAlimentacao = 3.5;

            double custoTotal;

            // Entrada
            System.out.println("Insira a quantidade de frangos: ");
            qtdFrango = sc.nextInt();

            // Processamento
            custoTotal = (qtdFrango * precoAnelChip) + (2 * (qtdFrango * precoAnelAlimentacao));

            // Saída
            System.out.println("O gasto total para marcar " + qtdFrango + " é R$" + custoTotal);
        }
    }
}