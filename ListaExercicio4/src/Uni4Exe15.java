
import java.util.Scanner;

/*
 * Exercício 15
 * Elabore um algoritmo para exibir o valor de reajuste 
 * que um funcionário receberá no seu salário. A empresa
 * irá conceder 5% de reajuste para o funcionário que for
 * admitido há até de 12 meses. Para funcionário admitido
 * entre 13 e 48 meses, irá conceder 7% de reajuste. O seu
 * algoritmo deve solicitar ao usuário que digite a 
 * quantidade de meses que o funcionário foi admitido.  
 */
public class Uni4Exe15 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // Declaração das variáveis
            int meses;

            // Entrada de dados
            while (true) {
                System.out.print("Insira quantos meses de empresa: ");

                if (sc.hasNextInt()) {
                    meses = sc.nextInt();
                    if (meses >= 0) {
                        break; // válido
                    }

                } else {
                    sc.next(); // limpa entrada inválida
                }

                System.err.println("Meses deve ser um inteiro e maior que 0!");
            }

            // Saída
            if (meses <= 12) {
                System.out.println("O funcionário irá receber 5% de reajuste");
            } else if (meses <= 48) {
                System.out.println("O funcionário irá receber 7% de reajuste");
            } else {
                System.out.println("Reajuste não informado");
            }
        }
    }
}
