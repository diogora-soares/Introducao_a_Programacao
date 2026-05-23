import java.util.Scanner;

/*
 * Uni7Exe04 - Salários por Departamento
 *
 * Lê o número de departamentos (máx 10) e de funcionários por departamento (máx 20),
 * depois lê o salário de cada funcionário. Ao final informa:
 *   - O maior salário e em qual departamento/posição ele está
 *   - A média salarial de cada departamento
 *   - Quantos funcionários ganham acima da média geral
 *
 * Métodos:
 *   lerMatriz                         -> valida dimensões e preenche a matriz de salários
 *   encontrarPosicaoMaiorSalario      -> localiza o índice [depto][funcionario] do maior salário
 *   calcularMediaDepto                -> calcula a média salarial de cada departamento
 *   calcularMediaGeral                -> calcula a média de todos os salários da empresa
 *   calcularQuantidadeSalariosAcimaMedia -> conta funcionários acima da média geral
 *   exibirResultados                  -> imprime todos os resultados calculados
 */

public class Uni7Exe04 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[][] salarioFuncionarios = lerMatriz(sc);
            int[] posicaoMaiorSalario = encontrarPosicaoMaiorSalario(salarioFuncionarios);
            double[] mediaDepto = calcularMediaDepto(salarioFuncionarios);
            double mediaGeral = calcularMediaGeral(salarioFuncionarios);
            int quantidadeSalariosAcimaMedia = calcularQuantidadeSalariosAcimaMedia(salarioFuncionarios, mediaGeral);
            exibirResultados(salarioFuncionarios, posicaoMaiorSalario, mediaDepto, mediaGeral, quantidadeSalariosAcimaMedia);
        }
    }

    /*
     * Solicita as dimensões da matriz com validação em loop (do-while):
     *   - departamentos: entre 1 e 10
     *   - funcionários por depto: entre 1 e 20
     * Depois preenche cada posição [depto][funcionario] com o salário lido.
     */
    public static double[][] lerMatriz(Scanner sc) {
        int qtdDepto;
        int qtdFuncionarioPorDepto;

        do {
            System.out.print("Informe a quantidade de departamentos (1-10): ");
            qtdDepto = sc.nextInt();
        } while (qtdDepto < 1 || qtdDepto > 10);

        do {
            System.out.print("Informe a quantidade de funcionários por departamento (1-20): ");
            qtdFuncionarioPorDepto = sc.nextInt();
        } while (qtdFuncionarioPorDepto < 1 || qtdFuncionarioPorDepto > 20);

        double[][] salarioFuncionarios = new double[qtdDepto][qtdFuncionarioPorDepto];

        for (int lin = 0; lin < salarioFuncionarios.length; lin++) {
            for (int col = 0; col < salarioFuncionarios[0].length; col++) {
                // col + 1: exibe numeração para o usuário
                System.out.printf("Informe o salário do %dº funcionário do departamento %d: ", (col + 1), (lin + 1));
                salarioFuncionarios[lin][col] = sc.nextDouble();
            }
        }
        return salarioFuncionarios;
    }

    /*
     * Percorre toda a matriz guardando os índices [lin][col] do maior valor encontrado.
     * Inicializa com o primeiro elemento [0][0] como candidato ao maior salário.
     * Retorna um array de 2 posições: [0] = linha (depto), [1] = coluna (funcionário).
     */
    public static int[] encontrarPosicaoMaiorSalario(double[][] funcionarios) {
        int[] posicaoMaiorSalario = {0, 0};
        double maiorSalario = funcionarios[0][0];

        for (int lin = 0; lin < funcionarios.length; lin++) {
            for (int col = 0; col < funcionarios[0].length; col++) {
                if (funcionarios[lin][col] > maiorSalario) {
                    maiorSalario = funcionarios[lin][col];
                    posicaoMaiorSalario[0] = lin;
                    posicaoMaiorSalario[1] = col;
                }
            }
        }
        return posicaoMaiorSalario;
    }

    /*
     * Para cada departamento (linha), acumula os salários e divide pelo número
     * de funcionários naquele departamento. Resultado em mediaDepto[depto].
     */
    public static double[] calcularMediaDepto(double[][] funcionarios) {
        double[] mediaDepto = new double[funcionarios.length];
        for (int lin = 0; lin < funcionarios.length; lin++) {
            for (int col = 0; col < funcionarios[0].length; col++) {
                mediaDepto[lin] += funcionarios[lin][col];
            }
            mediaDepto[lin] /= funcionarios[0].length;
        }
        return mediaDepto;
    }

    /*
     * Soma todos os salários da empresa (todos os elementos da matriz)
     * e divide pelo total de funcionários (linhas × colunas).
     */
    public static double calcularMediaGeral(double[][] funcionarios) {
        double mediaGeral = 0;
        for (int lin = 0; lin < funcionarios.length; lin++) {
            for (int col = 0; col < funcionarios[0].length; col++) {
                mediaGeral += funcionarios[lin][col];
            }
        }
        mediaGeral /= (funcionarios.length * funcionarios[0].length);
        return mediaGeral;
    }

    /*
     * Compara cada salário com a média geral e incrementa o contador
     * para cada funcionário que ganha estritamente acima dela.
     */
    public static int calcularQuantidadeSalariosAcimaMedia(double[][] funcionarios, double mediaGeral) {
        int quantidade = 0;
        for (int lin = 0; lin < funcionarios.length; lin++) {
            for (int col = 0; col < funcionarios[0].length; col++) {
                if (funcionarios[lin][col] > mediaGeral) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    /*
     * Exibe todos os resultados calculados:
     *   - Maior salário com a posição em numeração para o usuário
     *   - Média de cada departamento
     *   - Média geral da empresa
     *   - Quantidade de funcionários acima da média geral
     */
    public static void exibirResultados(double[][] funcionarios, int[] posicaoMaiorSalario,
            double[] mediaDepto, double mediaGeral, int quantidadeSalariosAcimaMedia) {

        System.out.printf("O maior salário é: R$ %.2f%n", funcionarios[posicaoMaiorSalario[0]][posicaoMaiorSalario[1]]);
        // +1 nos índices para exibir em numeração para usuário
        System.out.printf("Está no departamento %d, posição %d%n",
                (posicaoMaiorSalario[0] + 1), (posicaoMaiorSalario[1] + 1));

        for (int idx = 0; idx < funcionarios.length; idx++) {
            System.out.printf("Média salarial do departamento %d: R$ %.2f%n", (idx + 1), mediaDepto[idx]);
        }

        System.out.printf("Média salarial geral da empresa: R$ %.2f%n", mediaGeral);
        System.out.printf("Funcionários que ganham acima da média geral: %d%n", quantidadeSalariosAcimaMedia);
    }
}
