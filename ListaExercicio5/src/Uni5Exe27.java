import java.util.Scanner;

public class Uni5Exe27 {

    public static void main(String[] args) {

        int dia;
        int producaoManha;
        int producaoTarde;
        int totalProducao;

        int maiorProducao = 0;
        int diaMaiorProducao = 0;

        int totalManha = 0;
        int totalTarde = 0;

        int opcao = 1;

        double valorReceber;

        try (Scanner sc = new Scanner(System.in)) {

            while (opcao == 1) {

                do {
                    System.out.print("Informe o dia do mês de abril: ");
                    dia = sc.nextInt();

                    if (dia < 1 || dia > 30) {
                        System.out.println("Dia inválido");
                    }

                } while (dia < 1 || dia > 30);

                System.out.print("Informe a produção da manhã: ");
                producaoManha = sc.nextInt();

                System.out.print("Informe a produção da tarde: ");
                producaoTarde = sc.nextInt();

                totalProducao = producaoManha + producaoTarde;

                // primeira quinzena
                if (dia >= 1 && dia <= 15) {

                    if (totalProducao > 100
                            && producaoManha >= 30
                            && producaoTarde >= 30) {

                        valorReceber = totalProducao * 0.80;

                    } else {

                        valorReceber = totalProducao * 0.50;
                    }

                } else {

                    // segunda quinzena
                    valorReceber = (producaoManha * 0.40)
                            + (producaoTarde * 0.30);
                }

                // maior produção
                if (totalProducao > maiorProducao) {
                    maiorProducao = totalProducao;
                    diaMaiorProducao = dia;
                }

                // acumuladores dos períodos
                totalManha += producaoManha;
                totalTarde += producaoTarde;

                System.out.printf("Valor recebido: R$ %.2f%n",
                        valorReceber);

                System.out.print("Novo funcionário (1.sim 2.não)? ");
                opcao = sc.nextInt();
            }

            System.out.printf("%n--- RESULTADOS ---%n");

            System.out.printf("Maior produção ocorreu no dia %d%n",
                    diaMaiorProducao);

            if (totalManha > totalTarde) {

                System.out.printf("Maior produção no período da manhã: %d peças%n",
                        totalManha);

            } else {

                System.out.printf("Maior produção no período da tarde: %d peças%n",
                        totalTarde);
            }
        }
    }
}