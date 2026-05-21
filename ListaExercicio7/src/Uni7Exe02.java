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
        try(Scanner sc = new Scanner(System.in)){
            lerMatriz(sc, notas);
        }
    }

    public static void lerMatriz(Scanner sc, double[][] notas) {
        for (int lin = 0; lin < notas.length; lin++) {
            for (int col = 0; col < notas[0].length; col++) {
                System.out.printf("Insira a %dº nota do %dº aluno: ",(lin+1), (col+1));
                notas[lin][col] = sc.nextInt();
            }
        }  
    }
}
