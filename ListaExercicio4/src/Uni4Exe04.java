
import java.util.Scanner;

/*
 * Exercício 04
 * Verifica se valor tem casas decimais.
 */
public class Uni4Exe04 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            double valor;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o valor da hora: ");

                if (sc.hasNextDouble()) {
                    valor = sc.nextDouble();

                    if (valor > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor inválido! Digite um número maior que 0.");
            }

            // Saída
            if (valor != (int) valor) {
                System.out.printf("Foram digitadas casas decimais");
            } else {
                System.out.printf("Não foram digitadas casas decimais");
            }
        }
    }
}
