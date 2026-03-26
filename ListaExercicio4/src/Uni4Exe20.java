
import java.util.Scanner;

/*
 * Exercício 20
 * Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
 * descreva um algoritmo que calcule a média de aproveitamento e o conceito
 * do aluno, usando a fórmula:  

    media=(notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7

    A atribuição dos conceitos obedece à tabela abaixo:  
    | media          | conceito |  
    | -------------- |:--------:|  
    | >= 9.0         |    A     |  
    | >= 7.5 e < 9.0 |    B     |  
    | >= 6.0 e < 7.5 |    C     |  
    | >= 4.0 e < 6.0 |    D     |  
    |          < 4.0 |    E     |
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
            char conceito = 'z';

            // Entrada de dados
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

            media=(nota1+nota2*2+nota3*3+notaExercicios)/7;
            // Saída
             if(media >= 9){
                conceito = 'A';
            } else if(media >= 7.5){
                conceito = 'B';
            } else if(media >= 6){
                conceito = 'C';
            } else if(media >= 4){
                conceito = 'D';
            } else if(media < 4){
                conceito = 'E';
            }

            if (media >= 6) {
                System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. Aprovado", media,conceito);
            } else {
                System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. Reprovado", media,conceito);
            }
        }
    }
}
