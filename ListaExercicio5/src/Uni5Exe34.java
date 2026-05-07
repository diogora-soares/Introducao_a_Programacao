import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {

        int opcao;
        int diarias;

        int contasEncerradas = 0;

        double taxaServico;
        double totalPagar;

        String nome;

        try (Scanner sc = new Scanner(System.in)) {

            do {

                System.out.println("\n1 - Encerrar conta de hóspede");
                System.out.println("2 - Verificar número de contas encerradas");
                System.out.println("3 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                switch (opcao) {

                    case 1 -> {

                        System.out.print("Informe o nome do hóspede: ");
                        nome = sc.next();

                        System.out.print("Informe o número de diárias: ");
                        diarias = sc.nextInt();

                        if (diarias < 15) {

                            taxaServico = 7.50;

                        } else if (diarias == 15) {

                            taxaServico = 6.50;

                        } else {

                            taxaServico = 5.00;
                        }

                        totalPagar
                                = (diarias * 50.00)
                                + (diarias * taxaServico);

                        contasEncerradas++;

                        System.out.printf("%nHóspede: %s%n",
                                nome);

                        System.out.printf("Total a pagar: R$ %.2f%n",
                                totalPagar);
                    }

                    case 2 -> {

                        System.out.printf("%nNúmero de contas encerradas: %d%n",
                                contasEncerradas);
                    }

                    case 3 ->
                        System.out.println("Programa encerrado.");

                    default ->
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 3);
        }
    }
}