
public class Uni5Exe10 {

    public static void main(String[] args) {

        System.out.println("Os 10 primeiros números com a propriedade:");
        System.out.println("(esquerda + direita)² = número\n");

        int count = 0;

        for (int n = 1; count < 10; n++) {

            // Contar dígitos de n
            int numDigitos = 0;
            for (int temp = n; temp > 0; temp /= 10) {
                numDigitos++;
            }

            // Verificar se tem número par de dígitos
            if (numDigitos % 2 == 0 && numDigitos >= 2) {

                // Calcular 10^(metade) para separar o número
                int divisor = 1;
                for (int i = 0; i < numDigitos / 2; i++) {
                    divisor *= 10;
                }

                int parteDireita = n % divisor;
                int parteEsquerda = n / divisor;
                int soma = parteEsquerda + parteDireita;

                if (soma * soma == n) {
                    count++;
                    System.out.println(count + " - " + parteEsquerda + " + " + parteDireita
                            + " = " + soma + " -> " + soma + "² = " + n);
                }
            }
        }
    }
}
