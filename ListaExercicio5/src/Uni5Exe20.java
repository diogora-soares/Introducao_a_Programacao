/*
    Um determinado material radioativo perde metade de sua massa a 
    cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo
    que determine o tempo necessário para que essa massa se torne menor que 
    0,5 gramas. Escreva a massa inicial, a massa final e o tempo.  
 */

import java.util.Scanner;

public class Uni5Exe20 {

    public static void main(String[] args) {
        double massaInicial;
        double massa;
        int tempo = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira a massa do material: ");
            massa = sc.nextDouble();
            massaInicial = massa;
            while (massa >= 0.0005) {
                tempo += 50;
                massa /= 2;
            }
            System.out.printf("A massa inicial era de: %.6f Kg %n", massaInicial);
            System.out.printf("A massa final é de: %.6f Kg %n", massa);
            System.out.printf("O tempo que levou foi de %d segundos%n", tempo);
        }
    }
}
