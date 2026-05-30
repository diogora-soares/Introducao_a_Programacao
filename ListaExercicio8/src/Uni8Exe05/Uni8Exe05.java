import java.util.Scanner;

public class Uni8Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabela = new int[4][3];
        Jogador[] jogadores = new Jogador[4];

        System.out.println("=== CADASTRO ===");
        for (int i = 0; i < 4; i++) {
            System.out.print("Jogador " + (i + 1) + " - Nome: ");
            String nome = sc.nextLine();
            jogadores[i] = new Jogador(nome);
            for (int r = 0; r < 3; r++) {
                System.out.print("  Rodada " + (r + 1) + ": ");
                int pts = Integer.parseInt(sc.nextLine());
                jogadores[i].registrarPontuacao(r, pts);
                tabela[i][r] = pts;
            }
        }

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Tabela geral");
            System.out.println("2 - Ranking final");
            System.out.println("3 - Buscar jogador");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\n=== TABELA GERAL ===");
                    System.out.printf("%-10s| %-6s| %-6s| %-6s| Total%n", "Jogador", "R1", "R2", "R3");
                    for (int i = 0; i < 4; i++) {
                        int total = tabela[i][0] + tabela[i][1] + tabela[i][2];
                        System.out.printf("%-10s| %-6d| %-6d| %-6d| %d%n",
                            jogadores[i].nome, tabela[i][0], tabela[i][1], tabela[i][2], total);
                    }
                    break;

                case 2:
                    // encontrar campeão com while
                    System.out.println("\n=== RANKING FINAL ===");
                    int idxCampeao = 0;
                    int w = 1;
                    while (w < 4) {
                        if (jogadores[w].totalPontos() > jogadores[idxCampeao].totalPontos()) idxCampeao = w;
                        w++;
                    }
                    for (int i = 0; i < 4; i++) {
                        Jogador j = jogadores[i];
                        String campeao = (i == idxCampeao) ? " 🏆 CAMPEÃO" : "";
                        System.out.printf("%-8s- Total: %d - Média: %.1f - Melhor: Rodada %d - %s%s%n",
                            j.nome, j.totalPontos(), j.mediaPontos(), j.melhorRodada(), j.classificacao(), campeao);
                    }
                    break;

                case 3:
                    System.out.print("Nome: ");
                    String busca = sc.nextLine();
                    int idx = 0;
                    boolean encontrado = false;
                    while (idx < 4) {
                        if (jogadores[idx].nome.equalsIgnoreCase(busca)) {
                            encontrado = true;
                            break;
                        }
                        idx++;
                    }
                    if (encontrado) {
                        Jogador j = jogadores[idx];
                        System.out.println("=== DETALHES ===");
                        System.out.println("Nome: " + j.nome);
                        System.out.printf("Rodadas: %d | %d | %d%n",
                            j.pontuacoes[0], j.pontuacoes[1], j.pontuacoes[2]);
                        System.out.printf("Total: %d | Média: %.1f%n", j.totalPontos(), j.mediaPontos());
                        System.out.println("Melhor rodada: " + j.melhorRodada());
                        System.out.println("Classificação: " + j.classificacao());
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Fim do torneio!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
