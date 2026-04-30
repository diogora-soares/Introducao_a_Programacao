
public class Uni5Exe02 {

    public static void main(String[] args) {
        int contImpar = 0;
        int contPar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contPar += i;
            } else {
                contImpar += i;
            }
        }
        System.out.println("Soma dos numeros pares: " + contPar);
        System.out.println("Soma dos numeros ímpares: " + contImpar);

    }
}
