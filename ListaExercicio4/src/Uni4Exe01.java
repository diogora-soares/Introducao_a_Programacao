
import java.util.Scanner;

/*
 * Exercício 01
 * Calcula o salario com hora extra.
 */
public class Uni4Exe01 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int qtdHorasTrabalhadasMes;
            final int jornadaBaseMensal = 160;
            double valorHoraBase;
            double salarioExtra;
            double salarioTotal;
            final double porcentagemHoraExtra = 0.5;

            // Entrada de dados
            while (true) {
                System.out.print("Insira a quantidade de horas trabalhadas no mês: ");

                if (sc.hasNextInt()) {
                    qtdHorasTrabalhadasMes = sc.nextInt();

                    if (qtdHorasTrabalhadasMes > 0) {
                        break; // válido
                    }
                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Valor inválido! Digite um inteiro maior que 0.");
            }

            while (true) {
                System.out.print("Insira o valor da hora: ");

                if (sc.hasNextDouble()) {
                    valorHoraBase = sc.nextDouble();

                    if (valorHoraBase > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor inválido! Digite um número maior que 0.");
            }

            // Cálculo da Salário
            salarioTotal = qtdHorasTrabalhadasMes * valorHoraBase;
            if (qtdHorasTrabalhadasMes > jornadaBaseMensal) {
                salarioExtra = (qtdHorasTrabalhadasMes - jornadaBaseMensal) * (valorHoraBase * porcentagemHoraExtra);
                salarioTotal = salarioTotal + salarioExtra;
            }

            // Saída
            System.out.printf("Salário total de: R$%.2f", salarioTotal);
        }
    }
}
