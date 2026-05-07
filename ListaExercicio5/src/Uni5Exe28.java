import java.util.Scanner;

public class Uni5Exe28 {

    public static void main(String[] args) {

        int voto;
        int votosNenhumDeNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;

        int totalVotos;

        double percentualNenhumDeNos;
        double percentualCPM22;
        double percentualSkank;
        double percentualJotaQuest;

        String vencedor;

        char opcao = 's';

        try (Scanner sc = new Scanner(System.in)) {

            while (opcao == 's') {

                System.out.println("1 - Nenhum de Nós");
                System.out.println("2 - CPM22");
                System.out.println("3 - Skank");
                System.out.println("4 - Jota Quest");

                System.out.print("Informe o código do voto: ");
                voto = sc.nextInt();

                switch (voto) {

                    case 1 ->
                        votosNenhumDeNos++;

                    case 2 ->
                        votosCPM22++;

                    case 3 ->
                        votosSkank++;

                    case 4 ->
                        votosJotaQuest++;

                    default ->
                        System.out.println("Código inválido");
                }

                System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
                opcao = sc.next().toLowerCase().charAt(0);
            }

            totalVotos = votosNenhumDeNos
                    + votosCPM22
                    + votosSkank
                    + votosJotaQuest;

            percentualNenhumDeNos
                    = (votosNenhumDeNos * 100.0) / totalVotos;

            percentualCPM22
                    = (votosCPM22 * 100.0) / totalVotos;

            percentualSkank
                    = (votosSkank * 100.0) / totalVotos;

            percentualJotaQuest
                    = (votosJotaQuest * 100.0) / totalVotos;

            if (votosNenhumDeNos > votosCPM22
                    && votosNenhumDeNos > votosSkank
                    && votosNenhumDeNos > votosJotaQuest) {

                vencedor = "Nenhum de Nós";

            } else if (votosCPM22 > votosSkank
                    && votosCPM22 > votosJotaQuest) {

                vencedor = "CPM22";

            } else if (votosSkank > votosJotaQuest) {

                vencedor = "Skank";

            } else {

                vencedor = "Jota Quest";
            }

            System.out.printf("%n--- RESULTADOS ---%n");

            System.out.printf("Nenhum de Nós: %d votos (%.2f%%)%n",
                    votosNenhumDeNos,
                    percentualNenhumDeNos);

            System.out.printf("CPM22: %d votos (%.2f%%)%n",
                    votosCPM22,
                    percentualCPM22);

            System.out.printf("Skank: %d votos (%.2f%%)%n",
                    votosSkank,
                    percentualSkank);

            System.out.printf("Jota Quest: %d votos (%.2f%%)%n",
                    votosJotaQuest,
                    percentualJotaQuest);

            System.out.printf("Grupo vencedor: %s%n",
                    vencedor);
        }
    }
}