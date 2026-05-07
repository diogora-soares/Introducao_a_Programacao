import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {

        int n;
        int k;
        int m;

        int valorAtual;

        int somaDentro = 0;
        int somaFora = 0;

        String elementos = "";
        String dentroMochila = "";
        String foraMochila = "";

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Informe o valor inicial (N): ");
            n = sc.nextInt();

            System.out.print("Informe o decremento (K): ");
            k = sc.nextInt();

            System.out.print("Informe o tamanho da mochila (M): ");
            m = sc.nextInt();

            valorAtual = n;

            while (valorAtual > 0) {

                elementos += valorAtual + " ";

                // verifica se cabe na mochila
                if (somaDentro + valorAtual <= m) {

                    dentroMochila += valorAtual + " ";
                    somaDentro += valorAtual;

                } else {

                    foraMochila += valorAtual + " ";
                    somaFora += valorAtual;
                }

                valorAtual -= k;
            }

            System.out.printf("%n--- RESULTADOS ---%n");

            System.out.printf("Elementos gerados: %s%n",
                    elementos);

            System.out.printf("Entraram na mochila: %s%n",
                    dentroMochila);

            System.out.printf("Ficaram fora: %s%n",
                    foraMochila);

            System.out.printf("Soma dos elementos na mochila: %d%n",
                    somaDentro);

            System.out.printf("Soma dos elementos fora da mochila: %d%n",
                    somaFora);
        }
    }
}