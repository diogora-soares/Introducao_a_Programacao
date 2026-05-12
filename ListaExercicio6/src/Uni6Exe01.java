
import java.util.Scanner;

/* 
    Descreva um algoritmo que leia 10 números inteiros e os coloque 
    em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa 
    em que foram lidos. Faça um método para ler e outro para escrever.
*/
public class Uni6Exe01 {
    public static void main(String[] args) {
        int x[] = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < x.length; i++) {
                System.out.print("Insira o "+(i+1)+"º número: ");
                x[i] = sc.nextInt();
            }
            
            for (int i = x.length; i > 0; i--) {
                System.out.println(x[i-1]);
            }
        }
    }
}
