
import java.util.Scanner;

/**
 * Exercício 12
 * Calcula salário bruto e líquido de um funcionário.
 */
public class Uni3Exe12 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            String nome;
            int horasTrabalhadas;
            int qtdDependentes;

            double salarioTrabalho;
            double salarioBruto;
            double salarioLiquido;
            double valorIR;
            double valorINSS;

            final double valorHora = 10;
            final double valorDependente = 60;
            final double porcentagemINSS = 0.085;
            final double porcentagemIR = 0.05;

            System.out.println("Insira o nome: ");
            nome = sc.nextLine();

            System.out.println("Insira a quantidade de horas trabalhadas no mês: ");
            horasTrabalhadas = sc.nextInt();

            System.out.println("Insira a quantidade de dependentes: ");
            qtdDependentes = sc.nextInt();

            // cálculo do salário pelas horas
            salarioTrabalho = horasTrabalhadas * valorHora;

            // cálculo do salário bruto
            salarioBruto = salarioTrabalho + (qtdDependentes * valorDependente);

            // descontos
            valorINSS = salarioTrabalho * porcentagemINSS;
            valorIR = salarioTrabalho * porcentagemIR;

            // salário líquido
            salarioLiquido = salarioBruto - valorINSS - valorIR;

            System.out.printf(
                    "O funcionário %s possui um salário bruto de R$%.2f e um salário líquido de R$%.2f",
                    nome, salarioBruto, salarioLiquido);
        }
    }
}