
import java.util.Scanner;

/*
    Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
    Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), 
    uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

- qual a nota média recebida pelo cinema;
- qual a nota média atribuída pelos homens;
- qual a nota atribuída pela mulher mais jovem;
- quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.

Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício.
*/

public class Uni6Exe09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] respostaClientes = new int[30][3];
            lerDados(sc, respostaClientes);
            double media = calcularMedia(respostaClientes);
            double mediaHomens = calcularMediaHomens(respostaClientes);
            int notaMulherMaisJovem = acharNotaMulherMaisJovem(respostaClientes);
            int quantidadeMulheresMais50NotaAcimaMedia = acharQuantidadeMulheresMais50NotaAcimaMedia(respostaClientes,
                    media);
            exibirResultadoPesquisa(media, mediaHomens, notaMulherMaisJovem, quantidadeMulheresMais50NotaAcimaMedia);
        }
    }

    public static void lerDados(Scanner sc, int[][] respostaClientes) {
        for (int idx = 0; idx < respostaClientes.length; idx++) {
            System.out.printf("Pesquisa nº%d %n", (idx + 1));
            System.out.printf("Informe seu sexo (1=Feminino 2=Masculino): ");
            respostaClientes[idx][0] = sc.nextInt();
            while (respostaClientes[idx][0] != 1 && respostaClientes[idx][0] != 2) {
                System.err.println("Erro! Infrome um dos seguintes valores (1=Feminino 2=Masculino)");
                respostaClientes[idx][0] = sc.nextInt();
            }
            System.out.printf("De uma nota de 0 a 10 para o cinema: ");
            respostaClientes[idx][1] = sc.nextInt();
            while (respostaClientes[idx][1] < 0 || respostaClientes[idx][1] > 10) {
                System.err.println("Erro! Informe uma nota entre 0 a 10: ");
                respostaClientes[idx][1] = sc.nextInt();
            }
            System.out.printf("Informe sua idade: ");
            respostaClientes[idx][2] = sc.nextInt();
        }
    }


    public static double calcularMedia(int[][] respostaClientes) {
        double media = 0;
        for (int idx = 0; idx < respostaClientes.length; idx++) {
            media += respostaClientes[idx][1];
        }
        media /= respostaClientes.length;
        return media;
    }

    public static double calcularMediaHomens(int[][] respostaClientes) {
        int quantidadeHomens = 0;
        double mediaHomens = 0;
        for (int idx = 0; idx < respostaClientes.length; idx++) {
            if (respostaClientes[idx][0] == 2) {
                quantidadeHomens++;
                mediaHomens += respostaClientes[idx][1];
            }
        }
        if (quantidadeHomens > 0) {
            mediaHomens /= quantidadeHomens;
        }
        return mediaHomens;
    }

    public static int acharNotaMulherMaisJovem(int[][] respostaClientes) {
        int mulherMaisJovem = 100;
        int notaMulherMaisJovem = 0;
        for (int idx = 0; idx < respostaClientes.length; idx++) {
            if (respostaClientes[idx][0] == 1) {
                if (mulherMaisJovem > respostaClientes[idx][2]) {
                    notaMulherMaisJovem = respostaClientes[idx][1];
                    mulherMaisJovem = respostaClientes[idx][2];
                }
            }
        }
        return notaMulherMaisJovem;
    }

    public static int acharQuantidadeMulheresMais50NotaAcimaMedia(int[][] respostaClientes, double media) {
        int quantidadeMulheresMais50NotaAcimaMedia = 0;
        for (int idx = 0; idx < respostaClientes.length; idx++) {
            if (respostaClientes[idx][0] == 1 && respostaClientes[idx][2] > 50 && respostaClientes[idx][1] > media) {
                quantidadeMulheresMais50NotaAcimaMedia++;
            }
        }
        return quantidadeMulheresMais50NotaAcimaMedia;
    }

    public static void exibirResultadoPesquisa(double media, double mediaHomens, int notaMulherMaisJovem,
            int quantidadeMulheresMais50NotaAcimaMedia) {
        System.out.println("Resultados da pesquisa:");
        System.out.printf("Média das notas: %.2f %n", media);
        System.out.printf("Média das notas de Homens: %.2f %n", mediaHomens);
        System.out.printf("Nota da mulher mais jovem: %d %n", notaMulherMaisJovem);
        System.out.printf("Quantidade de mulheres acima de 50 anos com nota acima da média: %d",
                quantidadeMulheresMais50NotaAcimaMedia);

    }
}