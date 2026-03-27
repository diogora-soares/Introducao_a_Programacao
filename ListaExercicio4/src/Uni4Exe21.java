import java.util.Scanner;

/*
 * Exercício 21
 * Calcula IMC e classifica
 */
public class Uni4Exe21 {

    public static void main(String[] args) {

        // Declaração de variáveis
        double altura = 0;
        double peso = 0;
        double imc;

        try (Scanner sc = new Scanner(System.in)) {

            // Entrada do peso
            while (true) {
                System.out.println("Insira seu peso: ");
                if (sc.hasNextDouble()) {
                    peso = sc.nextDouble();
                    break;
                } else {
                    sc.next();
                }
                System.out.println("Erro! Peso deve ser um número.");
            }

            // Entrada da altura
            while (true) {
                System.out.println("Insira sua altura: ");
                if (sc.hasNextDouble()) {
                    altura = sc.nextDouble();
                    break;
                } else {
                    sc.next();
                }
                System.out.println("Erro! Altura deve ser um número.");
            }

            // Cálculo do IMC
            imc = peso / Math.pow(altura, 2);

            System.out.println(imc);

            // Classificação
            if (imc < 18.5) {
                System.out.println("Magreza");
            } else if (imc < 25) {
                System.out.println("Saudável");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else if (imc < 35) {
                System.out.println("Obesidade Grau I");
            } else if (imc < 40) {
                System.out.println("Obesidade Grau II (severa)");
            } else {
                System.out.println("Obesidade Grau III (mórbida)");
            }
        }
    }
}