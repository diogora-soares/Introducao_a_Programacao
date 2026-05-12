
import java.util.Scanner;

/*
    1. Leia as notas de 10 alunos (vetor de double)
2. Calcule a média da turma
3. Mostre quais alunos ficaram acima da média
4. Mostre a maior e a menor nota
Bônus: Ordene as notas do maior para o menor

*/

public class ExemploVetor {
    public static void main(String[] args) {
        double[] notas = new double[10];
        double denominador = notas.length;
        double media = 0;
        double menor = 101;
        double maior = 0;
        double guardaNota;
        try (Scanner sc = new Scanner(System.in)) {

            for (int idx = 0; idx < 10; idx++) {
                System.out.printf("Insira a nota do aluno %d : ", (idx + 1));
                notas[idx] = sc.nextDouble();
            }

         /*   for (int i = 0; i < 10; i++) {
                media += notas[i];
            }
            media = media / denominador;
            System.out.printf("Média: %.2f%n", media);

            System.out.printf("Notas acima da média: ");
            for (int i = 0; i < 10; i++) {
                if (notas[i] > media) {
                    System.out.printf("%.2f ", notas[i]);
                }
            }
            System.out.printf("%n");

            for (int i = 0; i < 10; i++) {
                if (maior < notas[i]) {
                    maior = notas[i];
                }
                if (menor > notas[i]) {
                    menor = notas[i];
                }
            }
            System.out.printf("Maior: %.2f %nMenor: %.2f", maior, menor); */

            for (int x = 0; x < notas.length - 1; x++) {
                for (int y = 0; y < notas.length - 1 - x; y++) {
                    if (notas[y] < notas[y+1]) {
                        guardaNota = notas[y];
                        notas[y] = notas[y + 1];
                        notas[y + 1] = guardaNota;
                    }
                }
            }

            System.out.printf("%nNotas ordenadas: ");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%.2f ",notas[i]);
            }
        }
    }
}
