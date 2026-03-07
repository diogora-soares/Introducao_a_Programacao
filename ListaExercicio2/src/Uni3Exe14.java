
import java.util.Scanner;

/**
 * Exercício 14
 * Calcula velocidade média e consumo de combustível.
 */
public class Uni3Exe14 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            double distancia;
            double horas;
            double velocidadeMedia;
            double consumoTotal;

            final double quilometroPorLitro = 12;

            System.out.println("Insira a distância percorrida (km): ");
            distancia = sc.nextDouble();

            System.out.println("Insira o tempo que levou (h): ");
            horas = sc.nextDouble();

            // cálculo da velocidade média
            velocidadeMedia = distancia / horas;

            // cálculo do consumo de combustível
            consumoTotal = distancia / quilometroPorLitro;

            System.out.printf(
                    "A velocidade média foi de %.2f km/h e a quantidade de combustível usado foi %.2f litros.",
                    velocidadeMedia, consumoTotal);
        }
    }
}