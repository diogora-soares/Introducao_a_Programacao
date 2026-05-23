import java.util.Scanner;

/*
 * Uni7Exe01 - Diagonal Principal de Matriz 4x4
 *
 * Lê uma matriz 4x4 de inteiros, exibe os elementos da diagonal principal
 * e calcula a soma desses elementos.
 *
 * Métodos:
 *   lerMatriz       -> preenche a matriz com valores lidos do teclado
 *   exibirDiagonal  -> imprime os elementos da diagonal e os copia para um vetor auxiliar
 *   calcularDiagonal -> soma os elementos do vetor da diagonal e retorna o resultado
 */

public class Uni7Exe01 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        // Vetor auxiliar que vai guardar apenas os elementos da diagonal principal
        int[] vetorDiagonal = new int[matriz.length];
        int somaDiagonal;

        // try-with-resources: garante que o Scanner seja fechado ao fim do bloco
        try (Scanner sc = new Scanner(System.in)) {
            lerMatriz(sc, matriz);
            exibirDiagonal(matriz, vetorDiagonal);
            somaDiagonal = calcularDiagonal(vetorDiagonal);
            System.out.printf("E a soma da diagonal é: %d", somaDiagonal);
        }
    }

    /*
     * Percorre todas as posições [lin][col] da matriz e solicita
     * um valor inteiro para cada uma.
     */
    public static void lerMatriz(Scanner sc, int[][] matriz) {
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.printf("Insira o valor da posição [%d][%d]: ", lin, col);
                matriz[lin][col] = sc.nextInt();
            }
        }
    }

    /*
     * Na diagonal principal, linha e coluna têm o mesmo índice: [0][0], [1][1], etc.
     * O método imprime cada elemento e o salva em vetorDiagonal para uso posterior.
     */
    public static void exibirDiagonal(int[][] matriz, int[] vetorDiagonal) {
        System.out.print("Os valores da diagonal principal da matriz são: ");
        for (int idx = 0; idx < matriz.length; idx++) {
            System.out.printf("%d ", matriz[idx][idx]);
            vetorDiagonal[idx] = matriz[idx][idx];
        }
        System.out.println();
    }

    /*
     * Percorre o vetor da diagonal acumulando a soma.
     * Retorna o total para ser usado no main.
     */
    public static int calcularDiagonal(int[] vetorDiagonal) {
        int soma = 0;
        for (int idx = 0; idx < vetorDiagonal.length; idx++) {
            soma += vetorDiagonal[idx];
        }
        return soma;
    }
}
