
import java.util.Scanner;

/**
 * Exercício 15
 * Separa um número em centena, dezena e unidade.
 */
public class Uni3Exe15 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int numero;
            int centena;
            int dezena;
            int unidade;

            System.out.println("Insira um número inteiro: ");
            numero = sc.nextInt();

            // separação dos dígitos
            centena = numero / 100;
            dezena = (numero % 100) / 10;
            unidade = numero % 10;

            System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)",
                    centena, dezena, unidade);
        }
    }
}