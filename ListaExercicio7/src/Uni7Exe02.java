import java.util.Scanner;

/*
 * Uni7Exe02 - Médias de Alunos e Provas (Matriz 3x5)
 *
 * Lê uma matriz 3x5 onde cada linha representa um aluno e cada coluna
 * representa uma prova. Calcula e exibe:
 *   - A média de cada aluno (média dos valores de cada linha)
 *   - A média de cada prova  (média dos valores de cada coluna)
 *
 * Métodos:
 *   lerMatriz          -> preenche a matriz com as notas lidas do teclado
 *   calcularMediaAluno -> calcula a média de cada linha (aluno) e armazena no vetor
 *   calcularMediaProva -> calcula a média de cada coluna (prova) e armazena no vetor
 *   exibirResultado    -> imprime os dois vetores de médias formatados
 */

public class Uni7Exe02 {

    public static void main(String[] args) {
        double[][] notas = new double[3][5]; // 3 alunos, 5 provas
        double[] mediaNotaAlunos = new double[notas.length];      // uma média por aluno
        double[] mediaNotaProvas = new double[notas[0].length];   // uma média por prova

        try (Scanner sc = new Scanner(System.in)) {
            lerMatriz(sc, notas);
            calcularMediaAluno(notas, mediaNotaAlunos);
            calcularMediaProva(notas, mediaNotaProvas);
            exibirResultado(mediaNotaAlunos, mediaNotaProvas);
        }
    }

    /*
     * Itera linha a linha (aluno a aluno) e coluna a coluna (prova a prova),
     * pedindo a nota correspondente a cada combinação.
     */
    public static void lerMatriz(Scanner sc, double[][] notas) {
        for (int lin = 0; lin < notas.length; lin++) {
            for (int col = 0; col < notas[0].length; col++) {
                System.out.printf("Insira a nota da %dª prova do %dº aluno: ", (col + 1), (lin + 1));
                notas[lin][col] = sc.nextDouble();
            }
            System.out.println(); // linha em branco entre alunos para melhor leitura
        }
    }

    /*
     * Para cada aluno (linha), acumula a soma das suas 5 notas e divide
     * pelo total de provas para obter a média. Resultado armazenado em mediaNotaAlunos[aluno].
     */
    public static void calcularMediaAluno(double[][] notas, double[] mediaNotaAlunos) {
        for (int idxAluno = 0; idxAluno < notas.length; idxAluno++) {
            for (int idxProva = 0; idxProva < notas[0].length; idxProva++) {
                mediaNotaAlunos[idxAluno] += notas[idxAluno][idxProva];
            }
            mediaNotaAlunos[idxAluno] /= notas[0].length; // divide pela quantidade de provas
        }
    }

    /*
     * Para cada prova (coluna), acumula a soma das notas dos 3 alunos e divide
     * pelo total de alunos para obter a média. Resultado armazenado em mediaNotaProvas[prova].
     */
    public static void calcularMediaProva(double[][] notas, double[] mediaNotaProvas) {
        for (int idxProva = 0; idxProva < notas[0].length; idxProva++) {
            for (int idxAluno = 0; idxAluno < notas.length; idxAluno++) {
                mediaNotaProvas[idxProva] += notas[idxAluno][idxProva];
            }
            mediaNotaProvas[idxProva] /= notas.length; // divide pela quantidade de alunos
        }
    }

    /*
     * Exibe as médias dos alunos e das provas com duas casas decimais.
     * %n é o separador de linha compatível com qualquer sistema operacional.
     */
    public static void exibirResultado(double[] mediaNotaAlunos, double[] mediaNotaProvas) {
        System.out.println("Média dos alunos:");
        for (int idxAluno = 0; idxAluno < mediaNotaAlunos.length; idxAluno++) {
            System.out.printf("%dº aluno média: %.2f %n", (idxAluno + 1), mediaNotaAlunos[idxAluno]);
        }
        System.out.println();
        System.out.println("Média das provas:");
        for (int idxProva = 0; idxProva < mediaNotaProvas.length; idxProva++) {
            System.out.printf("Média da %dª prova: %.2f %n", (idxProva + 1), mediaNotaProvas[idxProva]);
        }
    }
}
