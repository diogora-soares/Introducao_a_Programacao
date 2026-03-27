import java.util.Scanner;

/*
 * Exercício 01
 * 
 * Objetivo:
 * Calcular o salário total de um funcionário considerando horas extras.
 * 
 * Regras:
 * - Jornada base mensal: 160 horas
 * - Horas extras recebem adicional de 50% sobre o valor da hora
 */
public class Uni4Exe01 {

    public static void main(String[] args) {

        // Scanner para entrada de dados
        try (Scanner sc = new Scanner(System.in)) {

            // ===== Declaração das variáveis =====
            int qtdHorasTrabalhadasMes;     // Total de horas trabalhadas no mês
            final int jornadaBaseMensal = 160; // Limite de horas sem extra
            double valorHoraBase;           // Valor da hora normal
            double salarioExtra;            // Valor recebido pelas horas extras
            double salarioTotal;            // Salário final
            final double porcentagemHoraExtra = 0.5; // 50% adicional

            // ===== Entrada de dados =====

            // Leitura da quantidade de horas trabalhadas
            while (true) {
                System.out.print("Insira a quantidade de horas trabalhadas no mês: ");

                if (sc.hasNextInt()) {
                    qtdHorasTrabalhadasMes = sc.nextInt();

                    if (qtdHorasTrabalhadasMes > 0) {
                        break; // valor válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor inválido! Digite um inteiro maior que 0.");
            }

            // Leitura do valor da hora
            while (true) {
                System.out.print("Insira o valor da hora: ");

                if (sc.hasNextDouble()) {
                    valorHoraBase = sc.nextDouble();

                    if (valorHoraBase > 0) {
                        break; // valor válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor inválido! Digite um número maior que 0.");
            }

            // ===== Processamento =====

            // Cálculo do salário base
            salarioTotal = qtdHorasTrabalhadasMes * valorHoraBase;

            // Verifica se houve horas extras
            if (qtdHorasTrabalhadasMes > jornadaBaseMensal) {

                // Calcula apenas as horas que excedem a jornada
                int horasExtras = qtdHorasTrabalhadasMes - jornadaBaseMensal;

                // Calcula valor adicional das horas extras (50% a mais)
                salarioExtra = horasExtras * (valorHoraBase * porcentagemHoraExtra);

                // Soma ao salário total
                salarioTotal = salarioTotal + salarioExtra;
            }

            // ===== Saída =====
            System.out.printf("Salário total de: R$%.2f", salarioTotal);
        }
    }
}