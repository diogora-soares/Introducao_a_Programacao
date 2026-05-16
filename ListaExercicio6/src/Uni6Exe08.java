
import java.util.Scanner;

/*
    Faça um programa que leia um valor N inteiro limitado a 20 posições. 
    Com base neste valor, crie um vetor do tipo real. Faça o usuário 
    informar valores para as posições deste vetor e coloque-as nas 
    posições na sequência informada pelo usuário. Imprima  uma tabela 
    contendo cada valor diferente e o número de vezes que o valor aparece 
    no vetor
 */
public class Uni6Exe08 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int quantidadeValores = lerQuantidadeValores(sc);
            double[] valores = new double[quantidadeValores];
            lerValores(sc, valores);
            exibirResultado(valores);
        }
    }

    public static int lerQuantidadeValores(Scanner sc) {
        System.out.printf("Informe a quantidade de valores a ser inseridos: ");
        int quantidade = sc.nextInt();
        while (quantidade > 20) {
            System.err.println("Erro! quantidade de valores deve ser menor que 21.");
            System.out.printf("Informe a quantidade de valores a ser inseridos: ");
            quantidade = sc.nextInt();
        }
        return quantidade;
    }

    public static void lerValores(Scanner sc, double[] valores) {
        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("Informe o %dº valor: ", (idx + 1));
            valores[idx] = sc.nextDouble();
        }
    }

    public static void exibirResultado(double[] valores) {
        for (int x = 0; x < valores.length; x++) {

            boolean repetido = false;

            for (int y = 0; y < x; y++) {

                if (valores[x] == valores[y]) {
                    repetido = true;
                }
            }

            if (!repetido) {

                int quantidade = 0;

                for (int z = 0; z < valores.length; z++) {

                    if (valores[x] == valores[z]) {
                        quantidade++;
                    }
                }

                System.out.printf("%.2f aparece %d vez(es)%n",
                        valores[x], quantidade);
            }
        }
    }
}
