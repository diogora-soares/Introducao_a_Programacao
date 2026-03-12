import java.util.Scanner;

public class Uni3Exe18 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Entradas
            double distanciaPercorrida; 
            double tempoGastoMin;       

            // Saídas
            double tempoGastoHora;      
            double velocidadeMedia;     
            double ritmoMedio;          

            // Leitura dos dados
            System.out.println("Insira a distância percorrida em quilômetros: ");
            distanciaPercorrida = sc.nextDouble();

            System.out.println("Insira o tempo gasto em minutos: ");
            tempoGastoMin = sc.nextDouble();

            // Conversão de minutos para horas
            tempoGastoHora = tempoGastoMin / 60;

            // Cálculo da velocidade média
            velocidadeMedia = distanciaPercorrida / tempoGastoHora;

            // Cálculo do ritmo médio
            ritmoMedio = tempoGastoMin / distanciaPercorrida;

            // Saída
            System.out.printf(
                "Tempo em horas: %.2f h%nVelocidade média: %.2f km/h%nRitmo médio: %.2f min/km",
                tempoGastoHora, velocidadeMedia, ritmoMedio
            );
        }
    }
}