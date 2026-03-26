
import java.util.Scanner;

/*
 * Exercício 13
 * Leia uma data e determine se ela é válida.
 * Ou seja, verifique se o mês está entre 1 e
 * 12, e se o dia existe naquele mês. Note que
 * fevereiro tem 29 dias em anos bissextos, e 
 * 28 dias em anos não bissextos.
 */
public class Uni4Exe14 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int dia;
            int mes;
            int ano;

            // Entrada de dados
            System.out.print("Insira o dia: ");
            dia = sc.nextInt();

            System.out.print("Insira o mês: ");
            mes = sc.nextInt();

            System.out.print("Insira o ano: ");
            ano = sc.nextInt();

            // Saída
            if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    System.out.println("Válida");
                } else if (mes != 2 && dia < 31) {
                    System.out.println("Válida");
                } else if (mes == 2 && dia < 29) {
                    System.out.println("Válida");
                } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                    System.out.println("Válida");
                } else {
                    System.out.println("Não válida");
                }
            } else {
                System.out.println("Não válida");
            }
        }
    }
}
