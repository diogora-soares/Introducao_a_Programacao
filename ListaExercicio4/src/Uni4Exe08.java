import java.util.Scanner;

/*
 * Exercício 08
 * 
 * Objetivo:
 * Verificar se um caractere informado é uma vogal.
 */
public class Uni4Exe08 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            char letra; // Caractere informado pelo usuário

            // ===== Entrada de dados =====
            System.out.print("Insira um caractere para saber se é uma vogal: ");

            // Lê o caractere e converte para maiúsculo
            letra = Character.toUpperCase(sc.next().charAt(0));

            // ===== Processamento e Saída =====

            // Verifica se a letra é uma vogal
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("Seu valor é uma vogal!");
            } else {
                System.out.println("Seu valor não é uma vogal.");
            }
        }
    }
}