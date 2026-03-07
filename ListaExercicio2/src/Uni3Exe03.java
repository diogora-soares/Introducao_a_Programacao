
import java.util.Scanner;

/*
 * Exercício 03
 * Calcula quantos litros de gasolina podem ser comprados
 * com um determinado valor.
 */

public class Uni3Exe03 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double precoGasolina;
            double valorPagamento;
            double litrosGasolina;

            // Entrada
            System.out.println("Insira o preço do litro de gasolina: ");
            precoGasolina = sc.nextDouble();

            System.out.println("Insira o valor do pagamento: ");
            valorPagamento = sc.nextDouble();

            // Processamento
            litrosGasolina = valorPagamento / precoGasolina;

            // Arredondamento
            litrosGasolina = Math.round(litrosGasolina * 100.0) / 100.0;

            // Saída
            System.out.println("O motorista conseguiu colocar: " + litrosGasolina + " litros");
        }
    }
}