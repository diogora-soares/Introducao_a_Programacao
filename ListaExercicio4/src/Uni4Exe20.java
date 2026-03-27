import java.util.Scanner;

/*
 * Exercício 20
 * Calcula média ponderada e conceito do aluno
 */
public class Uni4Exe20 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            double nota1;
            double nota2;
            double nota3;
            double notaExercicios;
            double media;
            char conceito;

            // Entrada da nota 1
            while (true) {
                System.out.print("Insira a nota 1: ");

                if (sc.hasNextDouble()) {
                    nota1 = sc.nextDouble();

                    if (nota1 >= 0.0 && nota1 <= 10.0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Nota 1 deve ser um número entre 0 e 10!");
            }

            // Entrada da nota 2
            while (true) {
                System.out.print("Insira a nota 2: ");

                if (sc.hasNextDouble()) {
                    nota2 = sc.nextDouble();

                    if (nota2 >= 0.0 && nota2 <= 10.0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Nota 2 deve ser um número entre 0 e 10!");
            }

            // Entrada da nota 3
            while (true) {
                System.out.print("Insira a nota 3: ");

                if (sc.hasNextDouble()) {
                    nota3 = sc.nextDouble();

                    if (nota3 >= 0.0 && nota3 <= 10.0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Nota 3 deve ser um número entre 0 e 10!");
            }

            // Entrada da nota de exercícios
            while (true) {
                System.out.print("Insira a nota de exercicios: ");

                if (sc.hasNextDouble()) {
                    notaExercicios = sc.nextDouble();

                    if (notaExercicios >= 0.0 && notaExercicios <= 10.0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Nota de exercicios deve ser um número entre 0 e 10!");
            }

            // Cálculo da média ponderada
            media = (nota1 + nota2 * 2 + nota3 * 3 + notaExercicios) / 7;

            // Definição do conceito
            if (media >= 9) {
                conceito = 'A';
            } else if (media >= 7.5) {
                conceito = 'B';
            } else if (media >= 6) {
                conceito = 'C';
            } else if (media >= 4) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }

            // Saída
            if (media >= 6) {
                System.out.printf("A média foi: %.2f. Conceito: %c. Aprovado", media, conceito);
            } else {
                System.out.printf("A média foi: %.2f. Conceito: %c. Reprovado", media, conceito);
            }
        }
    }
}