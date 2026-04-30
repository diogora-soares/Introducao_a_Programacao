public class Uni5Exe04 {

    public static void main(String[] args) {
        double numerador = 3;
        double denominador;
        double s = 0;
        for (int i = 1; i <= 20; i++) {
            denominador = i * (i + 1);
            s += numerador / denominador;
            numerador += 2;
        }
        System.out.println("Resultado: " + s);
    }
}
