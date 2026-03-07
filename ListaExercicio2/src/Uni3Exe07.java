
import java.util.Scanner;

/*
 * Exercício 07
 * Calcula o total de litros de refrigerante comprados.
 */

public class Uni3Exe07 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Variáveis
            double totalLitros;

            int qtdLata;
            int qtdGarrafinha;
            int qtdGarrafa;

            // Constantes
            final double litrosLata = 0.35;
            final double litrosGarrafinha = 0.6;
            final double litrosGarrafa = 2;

            // Entrada
            System.out.println("Insira a quantidade de latas (350ml): ");
            qtdLata = sc.nextInt();

            System.out.println("Insira a quantidade de garrafinhas (600ml): ");
            qtdGarrafinha = sc.nextInt();

            System.out.println("Insira a quantidade de garrafas (2L): ");
            qtdGarrafa = sc.nextInt();

            // Processamento
            totalLitros = (qtdLata * litrosLata) +
                          (qtdGarrafinha * litrosGarrafinha) +
                          (qtdGarrafa * litrosGarrafa);

            // Saída
            System.out.println("O cliente comprou ao total " + totalLitros + " litros");
        }
    }
}