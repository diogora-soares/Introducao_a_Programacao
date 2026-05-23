import java.util.Scanner;

/*
 * Uni7Exe05 - Jogo da Velha (Tic-Tac-Toe) — com Desafio implementado
 *
 * Simula um jogo da velha em uma matriz 3x3 de chars.
 * O tabuleiro é inicializado com '\0' (char nulo) representando célula vazia.
 *
 * Menu principal (repetido até encerrar):
 *   1 - Jogar      : jogador informa linha e coluna; marca X ou O na vez correta
 *   2 - Exibir     : mostra o tabuleiro atual formatado
 *   3 - Sair       : encerra o programa
 *
 * Após cada jogada verifica vitória e empate.
 * Desafio: ao fim da partida pergunta se os jogadores querem jogar novamente.
 *
 * Métodos:
 *   exibirMenu         -> imprime as opções do menu
 *   jogar              -> registra a jogada do jogador da vez com validações
 *   exibirTabuleiro    -> imprime o tabuleiro formatado com separadores
 *   verificarVencedor  -> verifica linhas, colunas e diagonais; retorna o char do vencedor ou '\0'
 *   verificarEmpate    -> retorna true se não há células vazias E não houve vencedor
 *   perguntarSeContinua -> pergunta se os jogadores querem nova partida
 *   reiniciarTabuleiro -> zera todas as células do tabuleiro para '\0'
 */

public class Uni7Exe05 {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3]; // '\0' em cada célula por padrão
        int opcao;
        boolean vezDeX = false; // false = vez do O, true = vez do X
        char vencedor;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                exibirMenu();
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> {
                        jogar(sc, tabuleiro, vezDeX);
                        vezDeX = !vezDeX; // alterna o jogador após cada jogada válida
                        exibirTabuleiro(tabuleiro);
                    }
                    case 2 -> exibirTabuleiro(tabuleiro);
                }

                // Verifica vitória após qualquer jogada
                vencedor = verificarVencedor(tabuleiro);

                if (vencedor != '\0') {
                    System.out.printf("Jogo encerrado! Vitória do %c.%n", vencedor);
                    int opcaoContinuar = perguntarSeContinua(sc);
                    if (opcaoContinuar == 2) {
                        opcao = 3; // força saída do loop principal
                    } else {
                        reiniciarTabuleiro(tabuleiro);
                        vencedor = '\0';
                        vezDeX = false;
                    }
                } else {
                    boolean empate = verificarEmpate(tabuleiro);
                    if (empate) {
                        System.out.println("Empate!");
                        int opcaoContinuar = perguntarSeContinua(sc);
                        if (opcaoContinuar == 2) {
                            opcao = 3;
                        } else {
                            reiniciarTabuleiro(tabuleiro);
                            vezDeX = false;
                        }
                    }
                }

            } while (opcao != 3);
        }
    }

    /*
     * Exibe as três opções do menu ao jogador.
     */
    public static void exibirMenu() {
        System.out.println("\n1 - Jogar");
        System.out.println("2 - Exibir Tabuleiro");
        System.out.println("3 - Sair");
        System.out.print("Insira a opção desejada: ");
    }

    /*
     * Solicita linha e coluna ao jogador da vez e valida:
     *   - Linha e coluna devem estar dentro dos limites do tabuleiro
     *   - A célula escolhida não pode estar ocupada
     * Caso inválido, repete a solicitação. Ao final marca X ou O conforme vezDeX.
     */
    public static void jogar(Scanner sc, char[][] tabuleiro, boolean vezDeX) {
        int lin, col;
        boolean jogadaValida;

        // Exibe de quem é a vez antes de pedir a jogada
        System.out.printf("Vez do jogador %c%n", vezDeX ? 'X' : 'O');

        do {
            jogadaValida = true;

            // Valida linha (entrada entre 1 e tamanho do tabuleiro)
            do {
                System.out.printf("Insira a linha desejada (1-%d): ", tabuleiro.length);
                lin = sc.nextInt();
            } while (lin < 1 || lin > tabuleiro.length);

            // Valida coluna
            do {
                System.out.printf("Insira a coluna desejada (1-%d): ", tabuleiro[0].length);
                col = sc.nextInt();
            } while (col < 1 || col > tabuleiro[0].length);

            // Converte para índice de matriz
            lin--;
            col--;

            if (tabuleiro[lin][col] != '\0') {
                System.err.println("Posição já ocupada! Tente novamente.");
                jogadaValida = false;
            }
        } while (!jogadaValida);

        // Marca a peça do jogador correto
        tabuleiro[lin][col] = vezDeX ? 'X' : 'O';
    }

    /*
     * Percorre o tabuleiro linha a linha exibindo cada célula:
     *   - Células vazias ('\0') são exibidas como espaço em branco
     *   - Separador vertical '|' entre colunas
     *   - Separador horizontal "-----------" entre linhas
     */
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println();
        for (int lin = 0; lin < tabuleiro.length; lin++) {
            for (int col = 0; col < tabuleiro[0].length; col++) {
                if (tabuleiro[lin][col] == '\0') {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %c ", tabuleiro[lin][col]);
                }
                // Imprime '|' entre colunas, mas não após a última
                if (col < tabuleiro[0].length - 1) {
                    System.out.print("|");
                }
            }
            // Imprime separador entre linhas, mas não após a última
            if (lin < tabuleiro.length - 1) {
                System.out.printf("%n-----------%n");
            }
        }
        System.out.println();
    }

    /*
     * Verifica todas as condições de vitória:
     *   1. Linhas: todos os elementos iguais e não nulos
     *   2. Colunas: idem, percorrendo verticalmente
     *   3. Diagonal principal: [0][0] -> [1][1] -> [2][2]
     *   4. Diagonal secundária: [0][2] -> [1][1] -> [2][0]
     *
     * Retorna o char do vencedor ('X' ou 'O') ou '\0' se ninguém venceu.
     */
    public static char verificarVencedor(char[][] tabuleiro) {
        boolean venceu;

        // Verifica linhas
        for (int lin = 0; lin < tabuleiro.length; lin++) {
            venceu = true;
            for (int col = 0; col < tabuleiro[0].length - 1; col++) {
                // Célula vazia ou diferente da próxima: não há vitória nessa linha
                if (tabuleiro[lin][col] == '\0' || tabuleiro[lin][col] != tabuleiro[lin][col + 1]) {
                    venceu = false;
                    break;
                }
            }
            if (venceu) return tabuleiro[lin][0];
        }

        // Verifica colunas
        for (int col = 0; col < tabuleiro[0].length; col++) {
            venceu = true;
            for (int lin = 0; lin < tabuleiro.length - 1; lin++) {
                if (tabuleiro[lin][col] == '\0' || tabuleiro[lin][col] != tabuleiro[lin + 1][col]) {
                    venceu = false;
                    break;
                }
            }
            if (venceu) return tabuleiro[0][col];
        }

        // Verifica diagonal principal: [0][0], [1][1], [2][2]
        venceu = true;
        for (int idx = 0; idx < tabuleiro.length - 1; idx++) {
            if (tabuleiro[idx][idx] == '\0' || tabuleiro[idx][idx] != tabuleiro[idx + 1][idx + 1]) {
                venceu = false;
                break;
            }
        }
        if (venceu) return tabuleiro[0][0];

        // Verifica diagonal secundária: [0][2], [1][1], [2][0]
        venceu = true;
        for (int idx = 0; idx < tabuleiro.length - 1; idx++) {
            if (tabuleiro[idx][tabuleiro.length - 1 - idx] == '\0'
                    || tabuleiro[idx][tabuleiro.length - 1 - idx] != tabuleiro[idx + 1][tabuleiro.length - 2 - idx]) {
                venceu = false;
                break;
            }
        }
        if (venceu) return tabuleiro[0][tabuleiro.length - 1];

        return '\0'; // nenhuma condição de vitória encontrada
    }

    /*
     * Verifica empate: percorre o tabuleiro inteiro e retorna false se ainda houver
     * alguma célula vazia ('\0'). Se não houver célula vazia, o tabuleiro está cheio
     * e — como verificarVencedor já foi chamado antes — o resultado é empate.
     */
    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int lin = 0; lin < tabuleiro.length; lin++) {
            for (int col = 0; col < tabuleiro[0].length; col++) {
                if (tabuleiro[lin][col] == '\0') {
                    return false; // ainda há espaço: não é empate
                }
            }
        }
        return true; // tabuleiro cheio sem vencedor
    }

    /*
     * Pergunta se os jogadores querem jogar novamente.
     * Aceita apenas 1 (continuar) ou 2 (sair); repete até entrada válida.
     */
    public static int perguntarSeContinua(Scanner sc) {
        int opcaoContinuar;
        do {
            System.out.println("Deseja jogar novamente? (1 - Sim | 2 - Não)");
            opcaoContinuar = sc.nextInt();
        } while (opcaoContinuar < 1 || opcaoContinuar > 2);
        return opcaoContinuar;
    }

    /*
     * Percorre o tabuleiro inteiro e atribui '\0' a cada célula,
     * restaurando o estado inicial para uma nova partida.
     */
    public static void reiniciarTabuleiro(char[][] tabuleiro) {
        for (int lin = 0; lin < tabuleiro.length; lin++) {
            for (int col = 0; col < tabuleiro[0].length; col++) {
                tabuleiro[lin][col] = '\0';
            }
        }
    }
}
