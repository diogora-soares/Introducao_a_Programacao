
import java.util.Scanner;

/*
    Faça um programa que leia um valor N inteiro limitado a 20 posições. Com 
    base neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao 
    usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
    Esse número deverá ser armazenado no vetor caso ainda não exista, e se o 
    valor já existir deve ser pedido um novo valor. Isto é, se o usuário informar 
    o número 2 e já existir o número 2 em alguma posição do vetor, o número não 
    deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o 
    mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de 
    modo que este fique em ordem crescente, conforme no exemplo:

Vetor origem: \[0]\[4]\[2]\[6]\[3]  
Vetor ordenado: \[0]\[2]\[3]\[4]\[6]
 */
public class Uni6Exe07 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int quantidadeValores = lerQuantidadeValores(sc);
            int[] valores = new int[quantidadeValores];
            lerValores(sc, valores);
            System.out.printf("Valores desordenados: ");
            exibirValores(valores);
            ordenarValores(valores);
            System.out.printf("Valores ordenados: ");
            exibirValores(valores);
            

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

    public static void lerValores(Scanner sc, int[] valores) {
        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("Informe o valor desejado: ");
            valores[idx] = sc.nextInt();

            for (int j = 0; j < idx; j++) {
                while (valores[idx] == valores[j]) {
                    System.err.println("Erro! Valor já informado.");
                    System.out.printf("Informe o valor desejado: ");
                    valores[idx] = sc.nextInt();
                }
            }
        }
    }

    public static void ordenarValores(int[] valores) {
        int guardaValor;
        for (int x = 0; x < valores.length - 1; x++) {
            for (int y = 0; y < valores.length - 1 - x; y++) {
                if (valores[y] > valores[y + 1]) {
                    guardaValor = valores[y];
                    valores[y] = valores[y + 1];
                    valores[y + 1] = guardaValor;
                }
            }
        }
    }
    public static void exibirValores(int[] valores) {
        for (int idx = 0; idx < valores.length-1; idx++) {
            System.out.printf("%d, ",valores[idx]);
        }
        System.out.printf("%d.%n",valores[valores.length-1]);
    }
}
