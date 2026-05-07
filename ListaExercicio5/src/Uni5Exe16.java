import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        double altura;
        double somadorAlturaTotal = 0;
        double somadorAlturaFeminino = 0;
        double mediaTotal;
        double mediaFeminino;
        int contadorTotal = 0;
        int contadorFeminino = 0;
        char genero;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Informe a altura (0 para encerrar): ");
            altura = sc.nextDouble();
            while (altura != 0.0) {
                System.out.printf("Informe o genero: ");
                genero = sc.next().toLowerCase().charAt(0);
                contadorTotal++;
                somadorAlturaTotal += altura;
                if (genero == 'f') {
                    contadorFeminino++;
                    somadorAlturaFeminino += altura;
                }
                System.out.printf("Informe a altura (0 para encerrar): ");
                altura = sc.nextDouble();
            }
            if (contadorTotal > 0) {
                mediaTotal = somadorAlturaTotal / contadorTotal;
                System.out.printf("A média de altura do grupo é: %.2f%n", mediaTotal);
            }
            if (contadorFeminino > 0) {
                mediaFeminino = somadorAlturaFeminino / contadorFeminino;
                System.out.printf("A média da altura das mulheres é: %.2f%n", mediaFeminino);
            } else {
                System.out.println("Nenhuma mulher informada.");
            }
        }
    }
}
