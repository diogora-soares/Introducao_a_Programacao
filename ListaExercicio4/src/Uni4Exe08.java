
import java.util.Scanner;

/*
 * Exercício 08
 * Retorna se valor é uma vogal.
 */
public class Uni4Exe08 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            char letra;

            // Entrada de dados
            System.out.println("Insira um caracter para saber se é uma vogal: ");
            letra = Character.toUpperCase(sc.next().charAt(0));

            // Saída
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("Seu valor é uma vogal!");
            } else {
                System.out.println("Seu valor não é uma vogal.");
            }
        }
    }
}
