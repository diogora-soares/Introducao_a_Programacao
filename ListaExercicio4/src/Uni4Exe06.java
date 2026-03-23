
import java.util.Scanner;

/*
 * Exercício 06
 * Lê caracter e responde gênero.
 */
public class Uni4Exe06 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            char genero;

            // Entrada de dados
            while (true) {
                System.out.printf("Informe seu gênero (M/F/I): ");
                genero = Character.toUpperCase(sc.next().charAt(0));
                if (genero == 'M' || genero == 'F' || genero == 'I') {
                    break; // válido
                }
                System.err.printf("Entrada Incorreta!%n(M - Masculino)%n(F - Feminino)%n(I - Não informado)%n");
            }

            // Saída
            switch (genero) {
                case 'M':
                    System.out.println("Masculino");
                    break;
                case 'F':
                    System.out.println("Feminino");
                    break;
                case 'I':
                    System.out.println("Não Informado");
                    break;
                default:
                    System.out.println("Valor inesperado");
            }
        }
    }
}
