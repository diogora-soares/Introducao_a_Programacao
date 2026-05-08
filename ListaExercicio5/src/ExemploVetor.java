import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
        // Vetor que armazena as notas dos 10 alunos
        double[] notas = new double[10];
        double media = 0;
        double guardaNota; // Variável auxiliar para a troca no sort

        try (Scanner sc = new Scanner(System.in)) {

            // Leitura das notas pelo teclado
            for (int i = 0; i < notas.length; i++) {
                System.out.printf("Insira a nota do aluno %d: ", (i + 1));
                notas[i] = sc.nextDouble();
            }

            // Inicializa maior e menor com a primeira nota para evitar valores arbitrários
            double maior = notas[0];
            double menor = notas[0];

            // Acumula a soma das notas e já aproveita o loop para achar maior e menor
            for (int i = 0; i < notas.length; i++) {
                media += notas[i];
                if (notas[i] > maior) maior = notas[i];
                if (notas[i] < menor) menor = notas[i];
            }
            // Divide a soma pelo total de alunos para obter a média
            media /= notas.length;

            System.out.printf("Média: %.2f%n", media);

            // Percorre o vetor e exibe apenas as notas maiores que a média
            System.out.print("Notas acima da média: ");
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > media) {
                    System.out.printf("%.2f ", notas[i]);
                }
            }

            System.out.printf("%nMaior: %.2f%nMenor: %.2f%n", maior, menor);

            // Ordenação: para cada elemento x, compara com todos os outros y
            // Se x for menor que y, troca os dois de posição
            // Ao final, o vetor fica ordenado do menor para o maior (crescente)
            for (int x = 0; x < notas.length; x++) {
                for (int y = 0; y < notas.length; y++) {
                    if (notas[x] < notas[y]) {
                        guardaNota = notas[y];
                        notas[y] = notas[x];
                        notas[x] = guardaNota;
                    }
                }
            }

            // Exibe o vetor já ordenado
            System.out.print("Notas ordenadas: ");
            for (int i = 0; i < notas.length; i++) {
                System.out.printf("%.2f ", notas[i]);
            }
        }
    }
}