
public class Uni5Exe11 {

    public static void main(String[] args) {
        int biscoitosQuebradosHora = 1;
        int biscoitosQuebradosTotal = 1;
        for (int i = 2; i <= 16; i++) {
            if (i == 2) {
                biscoitosQuebradosHora = 3;
            } else {
                biscoitosQuebradosHora *= 3;
            }
            biscoitosQuebradosTotal += biscoitosQuebradosHora;
        }
        System.out.printf("O número de biscoitos quebrados após 16 horas é de: %d", biscoitosQuebradosTotal);
    }
}
