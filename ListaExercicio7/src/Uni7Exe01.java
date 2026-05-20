
import java.util.Scanner;


/*
    Descreva um algoritmo que leia valores inteiros para preencher uma matriz 4x4. 
    Em seguida, escreva os valores da diagonal principal e a soma desses valores. 
    Faça um método para ler a matriz, outro para identificar e escrever a diagonal 
    principal e outro para calcular e retornar a soma da diagonal
*/

public class Uni7Exe01 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[] vetorDiagonal = new int[matriz.length];
        int somaDiagonal;
        try(Scanner sc = new Scanner(System.in)){
            lerMatriz(sc, matriz);
            exibirDiagonal(matriz, vetorDiagonal);
            somaDiagonal = calcularDiagonal(vetorDiagonal);
            System.out.printf("E a soma da diagonal é: %d",somaDiagonal);
        }
    }

    public static void lerMatriz(Scanner sc, int[][] matriz) {  
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.printf("Insira o valor da posição [%d] [%d]: ",lin,col);
                matriz[lin][col] = sc.nextInt();
            }
        }    
    }

    public static void exibirDiagonal(int[][] matriz, int[] vetorDiagonal) {
        System.out.print("Os valores da diagonal principal da matriz são: ");
        for (int idx = 0; idx < matriz.length; idx++) {
            System.out.printf("%d ",matriz[idx][idx]);
            vetorDiagonal[idx] = matriz[idx][idx];
        }
        System.out.println();
    }

    public static int calcularDiagonal(int[] vetorDiagonal) {
        int retornaSomaDiagonal = 0;
        for (int idx = 0; idx < vetorDiagonal.length; idx++) {
            retornaSomaDiagonal += vetorDiagonal[idx];
        }
        return retornaSomaDiagonal;
    }
}
