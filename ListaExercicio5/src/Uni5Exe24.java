
import java.util.Scanner;

public class Uni5Exe24 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double limiteKg;
            double pesoPeixeGramas;
            double pesoPeixeKg;
            double totalKg = 0;
            char opcao = 's';

            System.out.print("Informe o limite diário de pesca (kg): ");
            limiteKg = sc.nextDouble();

            while (opcao == 's') {

                System.out.print("Informe o peso do peixe (gramas): ");
                pesoPeixeGramas = sc.nextDouble();

                pesoPeixeKg = pesoPeixeGramas / 1000.0;
                totalKg += pesoPeixeKg;

                System.out.printf("Total acumulado: %.2f kg%n", totalKg);

                if (totalKg > limiteKg) {
                    System.out.println("Limite diário excedido! Encerrando...");
                    break;
                }

                System.out.printf("Deseja informar o peso de mais um peixe? (s/n): ");
                opcao = sc.next().toLowerCase().charAt(0);
            }
        }
    }
}
