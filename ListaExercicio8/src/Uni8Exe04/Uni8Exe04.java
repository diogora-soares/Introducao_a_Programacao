import java.util.Scanner;

public class Uni8Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sala[] salas = new Sala[5];
        for (int i = 0; i < 5; i++) salas[i] = new Sala(i + 1);

        int opcao;
        do {
            System.out.println("\n=== CINEMA ===");
            System.out.println("1 - Ver mapa da sala");
            System.out.println("2 - Reservar assento");
            System.out.println("3 - Cancelar reserva");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Sala (1-5): ");
                    int numSala = Integer.parseInt(sc.nextLine());
                    if (numSala < 1 || numSala > 5) {
                        System.out.println("Sala inválida!");
                        break;
                    }
                    Sala sala = salas[numSala - 1];

                    if (opcao == 1) {
                        sala.exibirMapa();
                    } else {
                        System.out.print("Fileira (A-D): ");
                        char filChar = sc.nextLine().toUpperCase().charAt(0);
                        int fileira = filChar - 'A';
                        System.out.print("Coluna (1-6): ");
                        int coluna = Integer.parseInt(sc.nextLine()) - 1;

                        if (fileira < 0 || fileira > 3 || coluna < 0 || coluna > 5) {
                            System.out.println("Posição inválida!");
                            break;
                        }
                        if (opcao == 2) sala.reservar(fileira, coluna);
                        else            sala.cancelar(fileira, coluna);
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Até logo!");
        sc.close();
    }
}
