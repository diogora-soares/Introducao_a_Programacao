import java.util.Scanner;

public class Uni5Exe26 {

    public static void main(String[] args) {

        double valorMaximoPedagio;
        double pedagio;
        int distancia;

        int trechosAcimaLimite = 0;
        int totalTrechos = 0;
        int trechosAceitosMais150km = 0;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o valor máximo de pedágio: ");
            valorMaximoPedagio = sc.nextDouble();

            while (true) {

                System.out.print("Informe o valor do pedágio: ");
                pedagio = sc.nextDouble();

                if (pedagio < 0) {
                    break;
                }

                System.out.print("Informe a distância do trecho (km): ");
                distancia = sc.nextInt();

                totalTrechos++;

                if (pedagio > valorMaximoPedagio) {
                    trechosAcimaLimite++;
                }

                if (pedagio <= valorMaximoPedagio && distancia > 150) {
                    trechosAceitosMais150km++;
                }
            }

            System.out.printf("%n--- RESULTADOS ---%n");
            System.out.printf("%d trechos possuem pedágio acima do valor aceito%n",
                    trechosAcimaLimite);

            System.out.printf("%d trechos foram informados%n",
                    totalTrechos);

            System.out.printf("%d trechos acima de 150km possuem pedágio aceito%n",
                    trechosAceitosMais150km);
        }
    }
}