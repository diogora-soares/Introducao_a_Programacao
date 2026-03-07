
import java.util.Scanner;

/**
 * Exercício 16
 * Calcula o troco e quantidade de notas necessárias.
 */
public class Uni3Exe16 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int valorCompra;
            int valorDadoCliente;
            int valorTroco;

            int centena;
            int dezena;
            int unidade;

            System.out.println("Insira o valor total da compra: ");
            valorCompra = sc.nextInt();

            System.out.println("Insira o valor total dado pelo cliente: ");
            valorDadoCliente = sc.nextInt();

            // cálculo do troco
            valorTroco = valorDadoCliente - valorCompra;

            // cálculo das notas
            centena = valorTroco / 100;
            valorTroco = valorTroco % 100;

            dezena = valorTroco / 10;
            valorTroco = valorTroco % 10;

            unidade = valorTroco;

            System.out.printf("Quantidade de notas de 100 necessárias é: %d %n", centena);
            System.out.printf("Quantidade de notas de 10 necessárias é: %d %n", dezena);
            System.out.printf("Quantidade de notas de 1 necessárias é: %d %n", unidade);
        }
    }
}