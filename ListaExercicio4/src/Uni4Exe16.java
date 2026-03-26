
import java.util.Scanner;

/*
 * Exercício 16
 * Escreva um algoritmo que leia a idade de 2 homens
 * e 2 mulheres (considere que a idade entre homens
 * e mulheres sempre serão diferentes). Calcule e
 * escreva a soma das idades do homem mais velho com
 * a mulher mais nova, e o produto das idades do 
 * homem mais novo com a mulher mais velha. 
 */
public class Uni4Exe16 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int idadeHomem1;
            int idadeHomem2;
            int idadeMulher1;
            int idadeMulher2;
            int homemMaisVelho;
            int homemMaisNovo;
            int mulherMaisVelha;
            int mulherMaisNova;
            int soma;
            int produto;
            

            // Entrada de dados
            while (true) {
                System.out.print("Insira quantos anos tem o primeiro homem: ");

                if (sc.hasNextInt()) {
                    idadeHomem1 = sc.nextInt();
                    if (idadeHomem1 >= 0) {
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Idade deve ser um inteiro e maior que 0!");
            }

            while (true) {
                System.out.print("Insira quantos anos tem o segundo homem: ");

                if (sc.hasNextInt()) {
                    idadeHomem2 = sc.nextInt();
                    if (idadeHomem2 >= 0) {
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Idade deve ser um inteiro e maior que 0!");
            }

            while (true) {
                System.out.print("Insira quantos anos tem a primeira mulher: ");

                if (sc.hasNextInt()) {
                    idadeMulher1 = sc.nextInt();
                    if (idadeMulher1 >= 0) {
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Idade deve ser um inteiro e maior que 0!");
            }

            while (true) {
                System.out.print("Insira quantos anos tem a segunda mulher: ");

                if (sc.hasNextInt()) {
                    idadeMulher2 = sc.nextInt();
                    if (idadeMulher2 >= 0) {
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Idade deve ser um inteiro e maior que 0!");
            }

            // Saída
            if (idadeHomem1 > idadeHomem2) {
                homemMaisVelho = idadeHomem1;
                homemMaisNovo = idadeHomem2;
            } else {
                homemMaisVelho = idadeHomem2;
                homemMaisNovo = idadeHomem1;
            }

            if (idadeMulher1 > idadeMulher2) {
                mulherMaisVelha = idadeMulher1;
                mulherMaisNova = idadeMulher2;
            } else {
                mulherMaisVelha = idadeMulher2;
                mulherMaisNova = idadeMulher1;
            }

            soma = homemMaisVelho + mulherMaisNova;
            produto = homemMaisNovo * mulherMaisVelha;

            System.out.printf("Soma: %d  Produto: %d", soma, produto);
        }
    }
}
