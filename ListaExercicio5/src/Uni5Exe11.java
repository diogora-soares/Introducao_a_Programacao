
public class Uni5Exe11 {

    public static void main(String[] args) {
        int biscoitosQuebradosHora = 1;
        int biscoitosQuebradosTotal = 0;
        for (int i = 1; i < 16; i++) {
            biscoitosQuebradosHora *= 3;
            biscoitosQuebradosTotal += biscoitosQuebradosHora;
        }
        System.out.printf("O número de biscoitos quebrados após 16 horas é de: %d", biscoitosQuebradosTotal);
    }
}
