import java.util.Scanner;

/*
 * Exercício 06
 * 
 * Objetivo:
 * Ler um caractere e identificar o gênero informado.
 * 
 * Opções:
 * M - Masculino
 * F - Feminino
 * I - Não informado
 */
public class Uni4Exe06 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            char genero; // Armazena a opção digitada

            // ===== Entrada de dados =====
            while (true) {
                System.out.printf("Informe seu gênero (M/F/I): ");

                // Lê o primeiro caractere e converte para maiúsculo
                genero = Character.toUpperCase(sc.next().charAt(0));

                // Validação da entrada
                if (genero == 'M' || genero == 'F' || genero == 'I') {
                    break; // valor válido
                }

                System.err.printf(
                    "Entrada Incorreta!%n(M - Masculino)%n(F - Feminino)%n(I - Não informado)%n"
                );
            }

            // ===== Processamento =====

            // Uso de switch moderno (Java 14+)
            String resultado = switch (genero) {
                case 'M' -> "Masculino";
                case 'F' -> "Feminino";
                case 'I' -> "Não Informado";
                default -> "Valor inesperado";
            };

            // ===== Saída =====
            System.out.println(resultado);
        }
    }
}