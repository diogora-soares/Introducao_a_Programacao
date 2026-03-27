import java.util.Scanner;

/*
 * Exercício 07
 * 
 * Objetivo:
 * Calcular o valor de um selo com base no peso da carta.
 * 
 * Regras:
 * - Até 50g: valor padrão
 * - A cada 20g adicionais: acréscimo no valor
 */
public class Uni4Exe07 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            double pesoCarta;        // Peso informado
            final double pesoPadrao = 50.0;     // Limite sem adicional
            final double valorPadrao = 0.45;    // Valor base
            final double pesoAdicional = 20.0;  // Faixa adicional
            final double valorAdicional = 0.45; // Valor por faixa adicional

            double excesso;     // Peso excedente
            double adicionais;  // Quantidade de adicionais
            double valorSelo;   // Resultado final

            // ===== Entrada de dados =====
            while (true) {
                System.out.print("Insira o peso da carta: ");

                if (sc.hasNextDouble()) {
                    pesoCarta = sc.nextDouble();

                    if (pesoCarta > 0) {
                        break; // valor válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor inválido! Digite um número maior que 0.");
            }

            // ===== Processamento =====

            // Valor inicial
            valorSelo = valorPadrao;

            // Verifica se há excesso de peso
            if (pesoCarta > pesoPadrao) {

                // Calcula o excesso
                excesso = pesoCarta - pesoPadrao;

                // Arredonda para cima a quantidade de adicionais
                adicionais = Math.ceil(excesso / pesoAdicional);

                // Soma ao valor final
                valorSelo = valorPadrao + (adicionais * valorAdicional);
            }

            // ===== Saída =====
            System.out.printf("O valor do seu selo é: %.2f", valorSelo);
        }
    }
}