
import java.util.Scanner;

/*
 * Exercício 01
 * Calcula a área de um terreno retangular.
 */
public class Uni3Exe01 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            double comprimento;
            double largura;
            double area;

            // Entrada de dados
            System.out.println("Insira o comprimento do terreno em metros: ");
            comprimento = sc.nextDouble();

            System.out.println("Insira a largura do terreno em metros: ");
            largura = sc.nextDouble();

            // Cálculo da área
            area = comprimento * largura;

            // Saída
            System.out.println("O terreno tem " + area + " metros quadrados");
        }
    }
}
