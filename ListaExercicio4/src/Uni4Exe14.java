import java.util.Scanner;

/*
 * Exercício 14
 * 
 * Objetivo:
 * Verificar se uma data é válida.
 * Considera anos bissextos para fevereiro.
 */
public class Uni4Exe14 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int dia;
            int mes;
            int ano;

            // ===== Entrada de dados =====
            System.out.print("Insira o dia: ");
            dia = sc.nextInt();

            System.out.print("Insira o mês: ");
            mes = sc.nextInt();

            System.out.print("Insira o ano: ");
            ano = sc.nextInt();

            // ===== Processamento e Saída =====

            // Validação básica
            if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {

                // Meses com 31 dias
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                    mes == 8 || mes == 10 || mes == 12) {

                    System.out.println("Válida");

                // Meses com 30 dias
                } else if (mes != 2 && dia < 31) {

                    System.out.println("Válida");

                // Fevereiro comum
                } else if (mes == 2 && dia < 29) {

                    System.out.println("Válida");

                // Fevereiro bissexto
                } else if (dia == 29 && ano % 4 == 0 &&
                          !(ano % 100 == 0 && ano % 400 != 0)) {

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