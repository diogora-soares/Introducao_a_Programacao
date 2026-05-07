import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        int inscricao;
        int inscricaoMaior = 0;
        int inscricaoMenor = 0;
        int contador = 0;
        double somadorAltura = 0;
        double media;
        double altura;
        double alturaMaior = 0;
        double alturaMenor = 100;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira a inscrição do atleta: ");
            inscricao = sc.nextInt();
            if (inscricao != 0) {
                System.out.printf("Insira a altura do atleta: ");
                altura = sc.nextDouble();
                alturaMaior = altura;
                alturaMenor = altura;
                inscricaoMaior = inscricao;
                inscricaoMenor = inscricao;
                somadorAltura += altura;
                contador++;
                System.out.printf("Insira a inscrição do atleta: ");
                inscricao = sc.nextInt();
            }
            while (inscricao != 0) {
                System.out.printf("Insira a altura do atleta: ");
                altura = sc.nextDouble();
                somadorAltura += altura;
                contador++;
                if (altura > alturaMaior) {
                    inscricaoMaior = inscricao;
                    alturaMaior = altura;
                }
                if (altura < alturaMenor) {
                    inscricaoMenor = inscricao;
                    alturaMenor = altura;
                }
                System.out.printf("Insira a inscrição do atleta: ");
                inscricao = sc.nextInt();
            }
            if (contador > 0) {
                media = somadorAltura / contador;
                System.out.printf("O atleta mais baixo tem %.2fm e o seu número de inscrição é %d%n", alturaMenor, inscricaoMenor);
                System.out.printf("O atleta mais alto tem %.2fm e o seu número de inscrição é %d%n", alturaMaior, inscricaoMaior);
                System.out.printf("A altura média do grupo de atletas é: %.2f", media);
            } else {
                System.out.println("Nenhum atleta informado.");
            }
        }
    }
}
