
/*
    Descreva um algoritmo que leia 12 valores reais e os 
    coloque em um vetor de 12 posições do tipo real. Em 
    seguida, modifique o vetor de modo que os valores das 
    posições ímpares sejam aumentados em 5% e os das 
    posições pares sejam aumentados em 2%. Imprima o 
    vetor resultante. Faça um método para ler os valores, 
    outro para ajustar os valores dentro do vetor e outro 
    para escrever os valores atualizados do vetor.
 */
import java.util.Scanner;

public class Uni6Exe03 {

    public static void main(String[] args) {
        double[] valores = new double[12];
        // double[] valoresAtualizados = new double[valores.length];
        try (Scanner sc = new Scanner(System.in)) {

            // for (int i = 0; i < valores.length; i++) {
            //     System.out.printf("Informe o %dº valor: ", (i + 1));
            //     valores[i] = sc.nextDouble();
            // }
            lerValores(sc, valores);

            // for (int i = 0; i < valores.length; i++) {
            //     if ((i + 1) % 2 == 0) {
            //         valoresAtualizados[i] = valores[i] + (valores[i] * 0.02);
            //     } else {
            //         valoresAtualizados[i] = valores[i] + (valores[i] * 0.05);
            //     }
            // }
            double[] valoresAtualizados = calcularValores(valores);

            // for (int i = 0; i < valor.length; i++) {
            //     System.out.printf("%dº Valor atualizado: %.2f %n", (i + 1), valorAtualizado[i]);
            // }
            exibirValores(valoresAtualizados);
        }
    }

    public static void lerValores(Scanner sc, double[] vetor) {
        for (int idx = 0; idx < vetor.length; idx++) {
            System.out.printf("Informe o %dº valor: ", (idx + 1));
            vetor[idx] = sc.nextDouble();
        }
    }

    public static double[] calcularValores(double[] valores) {
        double[] valoresAtualizados = new double[valores.length];
        for (int idx = 0; idx < valores.length; idx++) {
            if ((idx + 1) % 2 == 0) {
                valoresAtualizados[idx] = valores[idx] + (valores[idx] * 0.02);
            } else {
                valoresAtualizados[idx] = valores[idx] + (valores[idx] * 0.05);
            }
        }
        return valoresAtualizados;
    }
    
    public static void exibirValores(double[] valores) {
        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("%dº Valor atualizado: %.2f %n", (idx + 1), valores[idx]);
        }
    }
}
