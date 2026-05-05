/*
    Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé 
    tem 1,10 metros e cresce 3 centímetros por ano. Construa um algoritmo 
    que calcule e imprima quantos anos serão necessários para que Zé seja 
    maior que Chico. 
*/

public class Uni5Exe21 {

    public static void main(String[] args) {
        int anos = 0;
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        while (alturaZe <= alturaChico) { 
            anos++;
            alturaChico += 0.02;
            alturaZe += 0.03;
        }
        System.out.printf("Demorou %d anos para que Zé se tornasse maior que Chico", anos);
    }
}
