
import java.util.Scanner;

public class Uni5Exe25 {

    public static void main(String[] args) {
        int pontosD = 0;
        int pontosE = 0;
        int diferenca;
        char ponto;
        char vencedor = ' ';

        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.printf("Informe quem pontuou (D/E): ");
                ponto = sc.next().toLowerCase().charAt(0);

                switch (ponto) {
                    case 'd' ->
                        pontosD++;
                    case 'e' ->
                        pontosE++;
                }

                if (pontosD >= pontosE) {
                    diferenca = pontosD - pontosE;
                } else {
                    diferenca = pontosE - pontosD;
                }

                if (((pontosD >= 21 || pontosE >= 21) && diferenca >= 2)) {
                    if (pontosD > pontosE) {
                        vencedor = 'D';
                        break;
                    } else {
                        vencedor = 'E';
                        break;
                    }
                }
            }
            System.out.printf("O vencedor é o jogador %s",vencedor);
        }
    }
}
