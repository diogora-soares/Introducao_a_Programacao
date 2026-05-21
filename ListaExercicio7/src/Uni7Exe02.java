/*
    Descreva um algoritmo que leia valores reais para preencher uma matriz 3x5 
    (3 linhas e 5 colunas). Essa matriz representa as notas de 3 alunos em 5 
    provas. O programa deve calcular e exibir a média de cada aluno (média de 
    cada linha) e a média de cada prova (média de cada coluna). Faça um método 
    para ler a matriz, outro para calcular e exibir as médias dos alunos e outro 
    para calcular e exibir as médias das provas
*/

import java.util.Scanner;

public class Uni7Exe02 {
    public static void main(String[] args) {
        double[][] notas = new double[3][5];
        double[] mediaNotaAlunos = new double[notas.length];
        double[] mediaNotaProvas = new double[notas[0].length];
        try (Scanner sc = new Scanner(System.in)) {
            lerMatriz(sc, notas);
            calcularMediaAluno(notas, mediaNotaAlunos);
            calcularMediaProva(notas, mediaNotaProvas);
            exibirResultado(mediaNotaAlunos, mediaNotaProvas);
        }
    }

    public static void lerMatriz(Scanner sc, double[][] notas) {
        for (int lin = 0; lin < notas.length; lin++) {
            for (int col = 0; col < notas[0].length; col++) {
                System.out.printf("Insira a nota da %dº prova do %dº aluno: ", (col + 1), (lin + 1));
                notas[lin][col] = sc.nextDouble();
            }
            System.out.println();
        }
    }

    public static void calcularMediaAluno(double[][] notas, double[] mediaNotaAlunos) {
        for (int idxAluno = 0; idxAluno < notas.length; idxAluno++) {
            for (int idxProva = 0; idxProva < notas[0].length; idxProva++) {
                mediaNotaAlunos[idxAluno] += notas[idxAluno][idxProva];
            }
            mediaNotaAlunos[idxAluno] /= notas[0].length;
        }
    }

    public static void calcularMediaProva(double[][] notas, double[] mediaNotaProvas) {
        for (int idxProva = 0; idxProva < notas[0].length; idxProva++) {
            for (int idxAluno = 0; idxAluno < notas.length; idxAluno++) {
                mediaNotaProvas[idxProva] += notas[idxAluno][idxProva];
            }
            mediaNotaProvas[idxProva] /= notas.length;
        }
    }

    public static void exibirResultado(double[] mediaNotaAlunos, double[] mediaNotaProvas) {
        System.out.println("Média dos alunos: ");
        for (int idxAluno = 0; idxAluno < mediaNotaAlunos.length; idxAluno++) {
            System.out.printf("%dº aluno média: %.2f %n",(idxAluno+1),mediaNotaAlunos[idxAluno]);
        }
        System.out.println();
        System.out.println("Média das provas: ");
        for (int idxProva = 0; idxProva < mediaNotaProvas.length; idxProva++) {
            System.out.printf("Média da %dª prova: %.2f %n",(idxProva+1),mediaNotaProvas[idxProva]);
        }   
    }
}
