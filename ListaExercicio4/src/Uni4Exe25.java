
import java.util.Scanner;

/*
 * Exercício 25
 * Menu de operações matemáticas básicas
 */
public class Uni4Exe25 {

    public static void main(String[] args) {

        // Declaração das variáveis
        int escolha;
        Double valor1;
        Double valor2;
        Double resultado = 0.0;

        try (Scanner sc = new Scanner(System.in)) {

            // Entrada do primeiro valor
            while (true) {
                System.out.println("Insira o valor 1: ");

                if (sc.hasNextDouble()) {
                    valor1 = sc.nextDouble();
                    break; // válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.out.println("Valor 1 deve ser um número!");
            }

            // Entrada do segundo valor
            while (true) {
                System.out.println("Insira o valor 2: ");

                if (sc.hasNextDouble()) {
                    valor2 = sc.nextDouble();
                    break; // válido
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.out.println("Valor 2 deve ser um número!");
            }

            // Menu de opções
            while (true) {
                System.out.println("Escolha a opção desejada");
                System.out.println("1 - Soma de dois números.");
                System.out.println("2 - Diferença entre dois números.");
                System.out.println("3 - Produto entre dois números.");
                System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

                // Validação da opção
                if (sc.hasNextInt()) {
                    escolha = sc.nextInt();

                    if (escolha > 0 && escolha < 5) {
                        break; // opção válida
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.out.println("Opção inválida");
            }

            // Processamento com base na escolha
            switch (escolha) {
                case 1 ->
                    resultado = valor1 + valor2; // soma
                case 2 ->
                    resultado = valor1 - valor2; // subtração
                case 3 ->
                    resultado = valor1 * valor2; // multiplicação
                case 4 -> {
                    if (valor2 == 0) {
                        System.out.println("Não pode dividir por zero");
                    }
                    resultado = valor1 / valor2;
                } // divisão
            }

            // Saída
            System.out.println("Resultado: " + resultado);
        }
    }
}
