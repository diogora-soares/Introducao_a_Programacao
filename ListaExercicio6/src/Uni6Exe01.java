
import java.util.Scanner;

/* 
    Descreva um algoritmo que leia 10 números inteiros e os coloque 
    em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa 
    em que foram lidos. Faça um método para ler e outro para escrever.
*/
public class Uni6Exe01 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            // for (int i = 0; i < x.length; i++) {
            //     System.out.print("Insira o "+(i+1)+"º número: ");
            //     x[i] = sc.nextInt();
            // }
            lerValores(sc, valores);
            
            // for (int i = vetor.length; i > 0; i--) {
            //     System.out.println(vetor[i-1]);
            // }
            exibirValores(valores);
        }
    }

    public static void lerValores(Scanner sc,int[] valores) {
        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("Insira o %dº número: ", (idx+1));
            valores[idx] = sc.nextInt();
        }
    }

    public static void exibirValores(int[] valores) {
        System.out.printf("%nA ordem inversa fica:%n");
        for (int idx = valores.length; idx > 0; idx--) {
            System.out.printf("%dº número: %d %n",idx,valores[idx-1]);
        }
    }
}
