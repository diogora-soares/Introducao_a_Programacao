
import java.util.Scanner;

/*
 * Exercício 04
 * Calcula valor selo.
 */
public class Uni4Exe07 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            double pesoCarta;
            double pesoPadrao = 50.0;
            double valorPadrao = 0.45;
            double pesoAdicional = 20.0;
            double valorAdicional = 0.45;
            double excesso;
            double adicionais;
            double valorSelo;

            // Entrada de dados
            while (true) {
                System.out.print("Insira o peso da carta: ");

                if (sc.hasNextDouble()) {
                    pesoCarta = sc.nextDouble();

                    if (pesoCarta > 0) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Valor inválido! Digite um número maior que 0.");
            }

            // Cálculo
            valorSelo = valorPadrao;
            if (pesoCarta > pesoPadrao) {
                excesso = pesoCarta - pesoPadrao;
                adicionais = Math.ceil(excesso / pesoAdicional);
                valorSelo = valorPadrao + (adicionais * valorAdicional);
            }

            // Saída
            System.out.printf("O valor do seu selo é: %.2f", valorSelo);
        }
    }
}
