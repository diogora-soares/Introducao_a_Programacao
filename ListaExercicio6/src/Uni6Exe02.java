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
        double[] valores = new double[12];
        try(Scanner sc = new Scanner(System.in)){

            // for (int i = 0; i < vetor.length; i++) {
            //     System.out.printf("Insira o %dº valor: ",(i+1));
            //     vetor[i] = sc.nextInt();
            // }
            lerValores(sc, valores);

            // for (int i = 0; i < vetor.length; i++) {
            //     soma += vetor[i];
            // }
            // media = soma / vetor.length;
            double media = calcularMedia(valores);

            // System.out.println(media);
            // for (int i = 0; i < vetor.length; i++) {
            //     if (vetor[i] > media) {
            //         System.out.printf("%.2f ", vetor[i]);
            //     }
            // }
            exibirValoresAcimaDaMedia(valores, media);
        }
    }

    public static void lerValores(Scanner sc, double[] valores) {
        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("Insira o %dº valor: ",(idx+1));
            valores[idx] = sc.nextDouble();
        }
    }

    public static double calcularMedia(double [] valores) {
        double soma = 0;
        for (int idx = 0; idx < valores.length; idx++) {
            soma += valores[idx];
        }
        double media = soma / valores.length;
        return media;
    }

    public static void exibirValoresAcimaDaMedia(double[] valores, double media) {
        System.out.printf("A média é: %.2f %n",media);
        System.out.printf("E os valores acima da média são: ");
        for (int idx = 0; idx < valores.length; idx++) {
            if (valores[idx] > media) {
                System.out.printf("%.2f ",valores[idx]);
            }
        }
    }
}
