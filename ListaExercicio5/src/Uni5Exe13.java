import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int paradas;
            System.out.printf("Informe a quantidade de paradas: ");
            paradas = sc.nextInt();
            int km;
            double litrosGasto;
            double mediaCombustivelGasto;
            double mediaCombustivelGastoTotal;
            double totalKm = 0;
            double totalLitrosGasto = 0;
            for (int i = 1; i <= paradas; i++) {
                System.out.printf("Informe a quilometragem rodada na parada %d: ", i);
                km = sc.nextInt();
                System.out.printf("Informe quantos litros gastou ate a parada %d: ", i);
                litrosGasto = sc.nextDouble();
                mediaCombustivelGasto = km / litrosGasto;
                totalKm += km;
                totalLitrosGasto += litrosGasto;
                System.out.printf("Parada %d: %.2f km por litro %n", i, mediaCombustivelGasto);
            }
            mediaCombustivelGastoTotal = totalKm / totalLitrosGasto;
            System.out.printf("Quilometragem média obtida por litro: %.2f", mediaCombustivelGastoTotal);
        }
    }
}
