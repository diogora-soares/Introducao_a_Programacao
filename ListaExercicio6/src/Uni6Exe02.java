/*
    Descreva um algoritmo que leia 12 valores reais e os coloque em 
    um vetor de 12 posições do tipo real. Imprima quais valores desses 
    informados são maiores que a média dos valores. Faça um método para 
    ler os valores, outro para calcular a média e outro para informar os 
    valores maiores que a média.
*/

import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] vetor = new double[12];
        double soma = 0;
        double media;
        try(Scanner sc = new Scanner(System.in)){

            for (int i = 0; i < vetor.length; i++) {
                System.out.printf("Insira o %dº valor: ",(i+1));
                vetor[i] = sc.nextInt();
            }

            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];
            }
            media = soma / vetor.length;
            System.out.println(media);
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] > media) {
                    System.out.printf("%.2f ", vetor[i]);
                }
            }
        }
    }
}
