import java.util.Scanner;

/*
 * Exercício 04
 * 
 * Objetivo:
 * Verificar se um número possui casas decimais.
 */
public class Uni4Exe04 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            double valor; // Número informado pelo usuário

            // ===== Entrada de dados =====
            while (true) {
                System.out.print("Insira o valor: ");

                if (sc.hasNextDouble()) {
                    valor = sc.nextDouble();

                    if (valor > 0) {
                        break; // valor válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor inválido! Digite um número maior que 0.");
            }

            // ===== Processamento e Saída =====

            // Verifica se há diferença entre o valor original e sua parte inteira
            if (valor != (int) valor) {
                System.out.printf("Foram digitadas casas decimais");
            } else {
                System.out.printf("Não foram digitadas casas decimais");
            }
        }
    }
}