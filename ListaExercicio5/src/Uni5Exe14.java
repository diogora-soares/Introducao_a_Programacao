import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        double PC;
        double PV;
        double percentualLucro;
        double percentualLucroTotal;
        double lucroTotal;
        double totalPC = 0;
        double totalPV = 0;
        int lucroGrande = 0;
        int lucroMedio = 0;
        int lucroPequeno = 0;

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i <= 20; i++) {
                System.out.printf("Informe o Preço de compra do item %d: ", i);
                PC = sc.nextDouble();
                System.out.printf("Informe o Preço de venda do item %d: ", i);
                PV = sc.nextDouble();
                totalPC += PC;
                totalPV += PV;
                percentualLucro = (PV - PC) / PC * 100;
                if (percentualLucro > 20) {
                    lucroGrande++;
                } else if (percentualLucro >= 10) {
                    lucroMedio++;
                } else {
                    lucroPequeno++;
                }
            }
            percentualLucroTotal = (totalPV - totalPC) / totalPC * 100;
            lucroTotal = totalPV - totalPC;
            System.out.printf(
                    "%d mercadorias tem lucro maior que 20 %n%d mercadorias tem lucro entre 10 e 20 %n%d mercadorias tem lucro menor que 10%n",
                    lucroGrande, lucroMedio, lucroPequeno);
            System.out.printf(
                    "Valor total de compra: %.2f %nValor total de venda: %.2f %nPercentual de lucro total: %.2f%% %nLucro total: %.2f",
                    totalPC, totalPV, percentualLucroTotal, lucroTotal);
        }
    }
}