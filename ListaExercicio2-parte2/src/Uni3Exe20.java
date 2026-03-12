import java.util.Scanner;

public class Uni3Exe20 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Constantes de preço
            final double precoGasolina = 5.75;
            final double precoEtanol = 4.29;

            // Entradas
            double qtdGasolina;
            double qtdEtanol;

            // Saídas
            double valorGasolina;
            double valorEtanol;
            double valorTotal;

            // Leitura da gasolina
            System.out.println("Insira quantidade de litros de gasolina: ");
            qtdGasolina = sc.nextDouble();

            while (qtdGasolina <= 0) {
                System.err.println("Erro! valor não pode ser menor ou igual a 0. Tente novamente: ");
                qtdGasolina = sc.nextDouble();
            }

            // Leitura do etanol
            System.out.println("Insira quantidade de litros de etanol: ");
            qtdEtanol = sc.nextDouble();

            while (qtdEtanol <= 0) {
                System.err.println("Erro! valor não pode ser menor ou igual a 0. Tente novamente:");
                qtdEtanol = sc.nextDouble();
            }

            // Cálculos
            valorGasolina = precoGasolina * qtdGasolina;
            valorEtanol = precoEtanol * qtdEtanol;
            valorTotal = valorGasolina + valorEtanol;

            // Saída
            System.out.printf(
                "Valor gasolina: R$ %.2f%nValor etanol: R$ %.2f%nTotal: R$ %.2f",
                valorGasolina, valorEtanol, valorTotal
            );
        }
    }
}