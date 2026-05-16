
import java.util.Scanner;

/*
    Faça um programa que leia um valor N inteiro. Com base neste 
    valor, crie um vetor do tipo real. Em seguida, solicite ao 
    usuário informar essa quantidade N de valores reais para popular 
    o vetor. Após ter preenchido o vetor, solicite que o usuário informe 
    um outro valor real. Informe para o usuário se este valor informado 
    se encontra cadastrado no vetor. Faça  um  método  para  ler  o  vetor 
    e outro, que retorne verdadeiro ou falso, para encontrar o valor.
 */
public class Uni6Exe06 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira a quantidade de valores que deseja informar: ");
            int quantidadeValores = sc.nextInt();
            double[] valores = new double[quantidadeValores];
            double valorProcurado;

            lerValores(sc, valores);

            System.out.printf("Informe o valor procurado: ");
            valorProcurado = sc.nextDouble();

            boolean valorEncontrado = verificarValorEncontrado(valores, valorProcurado);

            if (valorEncontrado) {
                System.out.println("O valor foi encontrado!");
            } else {
                System.out.println("O valor não foi encontrado!");
            }
        }
    }

    public static void lerValores(Scanner sc, double[] valores) {
        for (int idx = 0; idx < valores.length; idx++) {
            System.out.printf("Insira o %dº valor: ", (idx + 1));
            valores[idx] = sc.nextDouble();
        }
    }

    public static boolean verificarValorEncontrado(double[] valores, double valorProcurado) {
        for (int idx = 0; idx < valores.length; idx++) {
            if (valorProcurado == valores[idx]) {
                return true;
            }
        }
        return false;
    }
}
