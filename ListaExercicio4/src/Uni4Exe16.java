import java.util.Scanner;

/*
 * Exercício 16
 * 
 * Objetivo:
 * Calcular:
 * - Soma: homem mais velho + mulher mais nova
 * - Produto: homem mais novo * mulher mais velha
 */
public class Uni4Exe16 {

    public static void main(String[] args) {

        // ===== Declaração das variáveis =====
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

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Entrada de dados =====

            // Homens
            while (true) {
                System.out.print("Idade do primeiro homem: ");
                if (sc.hasNextInt()) {
                    idadeHomem1 = sc.nextInt();
                    if (idadeHomem1 >= 0) break;
                } else sc.next();
                System.err.println("Valor inválido!");
            }

            while (true) {
                System.out.print("Idade do segundo homem: ");
                if (sc.hasNextInt()) {
                    idadeHomem2 = sc.nextInt();
                    if (idadeHomem2 >= 0) break;
                } else sc.next();
                System.err.println("Valor inválido!");
            }

            // Mulheres
            while (true) {
                System.out.print("Idade da primeira mulher: ");
                if (sc.hasNextInt()) {
                    idadeMulher1 = sc.nextInt();
                    if (idadeMulher1 >= 0) break;
                } else sc.next();
                System.err.println("Valor inválido!");
            }

            while (true) {
                System.out.print("Idade da segunda mulher: ");
                if (sc.hasNextInt()) {
                    idadeMulher2 = sc.nextInt();
                    if (idadeMulher2 >= 0) break;
                } else sc.next();
                System.err.println("Valor inválido!");
            }

            // ===== Processamento =====

            // Homens
            if (idadeHomem1 > idadeHomem2) {
                homemMaisVelho = idadeHomem1;
                homemMaisNovo = idadeHomem2;
            } else {
                homemMaisVelho = idadeHomem2;
                homemMaisNovo = idadeHomem1;
            }

            // Mulheres
            if (idadeMulher1 > idadeMulher2) {
                mulherMaisVelha = idadeMulher1;
                mulherMaisNova = idadeMulher2;
            } else {
                mulherMaisVelha = idadeMulher2;
                mulherMaisNova = idadeMulher1;
            }

            // Cálculos
            soma = homemMaisVelho + mulherMaisNova;
            produto = homemMaisNovo * mulherMaisVelha;

            // ===== Saída =====
            System.out.printf("Soma: %d  Produto: %d", soma, produto);
        }
    }
}