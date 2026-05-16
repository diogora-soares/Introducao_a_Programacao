/*
    Faça um programa para ler os valores de dois vetores de 
    inteiros, cada um contendo 10 elementos. Crie um terceiro 
    vetor em que cada elemento é a soma dos valores contidos 
    nas posições respectivas dos vetores originais. Por 
    exemplo, vetor1 = \[1,2,3] vetor2 = \[1,5,6] vetor3 = \[2,7,9]. 
    Exiba, ao final, os três vetores na tela. Faça três métodos: um 
    método para ler valores dos vetores, outro para somar e outro para 
    escrever os vetores.
 */

import java.util.Scanner;

public class Uni6Exe04 {

    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[vetor1.length];
        int[] vetor3 = new int[vetor1.length];

        try (Scanner sc = new Scanner(System.in)) {

            // for (int idx = 0; idx < vetor1.length; idx++) {
            //     System.out.printf("Informe o %dº valor do primeiro vetor: ",(idx+1));
            //     vetor1[idx] = sc.nextInt();
            //     System.out.printf("Informe o %dº valor do segundo vetor: ",(idx+1));
            //     vetor2[idx] = sc.nextInt();
            // }
            lerVetor(sc, vetor1, "primeiro vetor");
            lerVetor(sc, vetor2, "segundo vetor");

            // for (int idx = 0; idx < vetor1.length; idx++) {
            //     vetor3[idx] = vetor1[idx] + vetor2[idx];
            // }
            somarVetores(vetor1, vetor2, vetor3);

            // for (int idx = 0; idx < vetor1.length; idx++) {
            //     System.out.printf("O resultado da %dª soma é: %d %n", (idx + 1), vetor3[idx]);
            // }
            exibirSomaVetores(vetor1, vetor2, vetor3);
        }
    }

    public static void lerVetor(Scanner sc, int[] vetor, String nome) {
        for (int idx = 0; idx < vetor.length; idx++) {
            System.out.printf("Insira o %dº valor do %s: ", (idx + 1), nome);
            vetor[idx] = sc.nextInt();
        }
    }

    public static void somarVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
        for (int idx = 0; idx < vetor1.length; idx++) {
            vetor3[idx] = vetor1[idx] + vetor2[idx];
        }
    }

    public static void exibirSomaVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
        for (int idx = 0; idx < vetor1.length; idx++) {
            System.out.printf("%dª soma: %d + %d = %d %n", (idx + 1), vetor1[idx], vetor2[idx], vetor3[idx]);
        }
    }
}