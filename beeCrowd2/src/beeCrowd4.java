
import java.util.Scanner;

public class beeCrowd4 {
    public static void main(String[] args) {
        int horaInicial;
        int horaFinal;
        int duracao;
        try (Scanner sc = new Scanner(System.in)) {

            horaInicial = sc.nextInt();
            horaFinal = sc.nextInt();

            if (horaFinal <= horaInicial) {
                horaFinal = horaFinal + 24;
            }
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}
