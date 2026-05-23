import java.util.Scanner;

/*
 * Uni7Exe03 - Multiplicação de Matrizes 3x3
 *
 * Lê duas matrizes 3x3 de inteiros, calcula o produto entre elas
 * e exibe as três matrizes (A, B e o resultado A×B).
 *
 * Regra da multiplicação: resultado[i][j] = soma de (A[i][k] * B[k][j])
 * para todo k de 0 até N-1. O elemento resultante é o produto escalar
 * entre a linha i de A e a coluna j de B.
 *
 * Métodos:
 *   lerMatriz         -> lê os valores de uma matriz do teclado
 *   multiplicarMatrizes -> executa a multiplicação e retorna a matriz resultado
 *   exibirMatrizes    -> imprime uma matriz formatada no console
 */

public class Uni7Exe03 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        // matriz2 usa as mesmas dimensões de matriz1 para garantir compatibilidade na multiplicação
        int[][] matriz2 = new int[matriz1.length][matriz1[0].length];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Matriz 1 ===");
            lerMatriz(sc, matriz1);
            System.out.println("=== Matriz 2 ===");
            lerMatriz(sc, matriz2);

            int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

            System.out.println("Matriz 1:");
            exibirMatrizes(matriz1);
            System.out.println("Matriz 2:");
            exibirMatrizes(matriz2);
            System.out.println("Resultado (Matriz 1 x Matriz 2):");
            exibirMatrizes(resultado);
        }
    }

    /*
     * Percorre cada posição [lin][col] da matriz recebida e lê um inteiro do teclado.
     * O parâmetro matriz é alterado diretamente (passagem por referência em Java para arrays).
     */
    public static void lerMatriz(Scanner sc, int[][] matriz) {
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.printf("Insira o valor de posição [%d][%d]: ", lin, col);
                matriz[lin][col] = sc.nextInt();
            }
        }
    }

    /*
     * Multiplicação de matrizes quadradas N×N:
     *   - Loop externo (lin): seleciona a linha de matriz1
     *   - Loop do meio (col): seleciona a coluna de matriz2
     *   - Loop interno (k): percorre os elementos que serão multiplicados e acumulados
     *
     * Exemplo para resultado[0][0]:
     *   A[0][0]*B[0][0] + A[0][1]*B[1][0] + A[0][2]*B[2][0]
     */
    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz1[0].length];
        for (int lin = 0; lin < matriz1.length; lin++) {
            for (int col = 0; col < matriz1[0].length; col++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[lin][col] += matriz1[lin][k] * matriz2[k][col];
                }
            }
        }
        return resultado;
    }

    /*
     * Exibe cada linha da matriz, com os valores alinhados em 4 caracteres (%4d)
     * para facilitar a leitura de números com dígitos diferentes.
     */
    public static void exibirMatrizes(int[][] matriz) {
        System.out.println();
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.printf("%4d ", matriz[lin][col]);
            }
            System.out.println();
        }
    }
}
