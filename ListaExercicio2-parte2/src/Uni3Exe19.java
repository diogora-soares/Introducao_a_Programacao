import java.util.Scanner;

public class Uni3Exe19 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Entradas
            double salario;
            int mesesTrabalhados;

            // Constante que representa 1/12 do salário
            final double umDozeAvosSalario = 1.0 / 12.0;

            // Saída
            double valorDecimoTerceiro;

            // Leitura do salário
            System.out.println("Insira o seu salário: ");
            salario = sc.nextDouble();

            // Validação
            while (salario <= 0) {
                System.err.println("Erro! valor não pode ser menor ou igual a 0. Tente novamente:");
                salario = sc.nextDouble();
            }

            // Leitura dos meses trabalhados
            System.out.println("Insira quantos meses você trabalhou: ");
            mesesTrabalhados = sc.nextInt();

            // Validação
            while (mesesTrabalhados > 12 || mesesTrabalhados <= 0) {
                System.err.println("Erro! valor não pode ser menor que 1 ou maior que 12. Tente novamente:");
                mesesTrabalhados = sc.nextInt();
            }

            // Cálculo do 13º proporcional
            valorDecimoTerceiro = (salario * umDozeAvosSalario) * mesesTrabalhados;

            // Saída
            System.out.printf("O valor do 13º salário é R$ %.2f", valorDecimoTerceiro);
        }
    }
}