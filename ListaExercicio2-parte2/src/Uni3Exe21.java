import java.util.Scanner;

public class Uni3Exe21 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Entradas
            double peso;
            double altura;

            // Saída
            double imc;

            // Leitura dos dados
            System.out.println("Insira seu peso: ");
            peso = sc.nextDouble();

            System.out.println("Insira sua altura: ");
            altura = sc.nextDouble();

            // Cálculo do IMC
            imc = peso / (altura * altura);

            // Saída
            System.out.printf("O IMC da pessoa é %.2f", imc);
        }
    }
}