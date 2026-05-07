import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) {

        int voto;

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;

        int votosNulos = 0;
        int votosBranco = 0;

        int totalVotos;

        double percentualNulos;
        double percentualBranco;

        try (Scanner sc = new Scanner(System.in)) {

            do {

                System.out.println("1 - Candidato 1");
                System.out.println("2 - Candidato 2");
                System.out.println("3 - Candidato 3");
                System.out.println("4 - Candidato 4");
                System.out.println("5 - Voto nulo");
                System.out.println("6 - Voto em branco");
                System.out.println("0 - Encerrar");

                System.out.print("Informe seu voto: ");
                voto = sc.nextInt();

                switch (voto) {

                    case 1 ->
                        candidato1++;

                    case 2 ->
                        candidato2++;

                    case 3 ->
                        candidato3++;

                    case 4 ->
                        candidato4++;

                    case 5 ->
                        votosNulos++;

                    case 6 ->
                        votosBranco++;

                    case 0 -> {
                    }

                    default ->
                        System.out.println("Opção incorreta");
                }

            } while (voto != 0);

            totalVotos = candidato1
                    + candidato2
                    + candidato3
                    + candidato4
                    + votosNulos
                    + votosBranco;

            percentualNulos
                    = (votosNulos * 100.0) / totalVotos;

            percentualBranco
                    = (votosBranco * 100.0) / totalVotos;

            System.out.printf("%n--- RESULTADOS ---%n");

            System.out.printf("Candidato 1: %d voto(s)%n",
                    candidato1);

            System.out.printf("Candidato 2: %d voto(s)%n",
                    candidato2);

            System.out.printf("Candidato 3: %d voto(s)%n",
                    candidato3);

            System.out.printf("Candidato 4: %d voto(s)%n",
                    candidato4);

            System.out.printf("Votos nulos: %d%n",
                    votosNulos);

            System.out.printf("Votos em branco: %d%n",
                    votosBranco);

            System.out.printf("Percentual de votos nulos: %.2f%%%n",
                    percentualNulos);

            System.out.printf("Percentual de votos em branco: %.2f%%%n",
                    percentualBranco);
        }
    }
}