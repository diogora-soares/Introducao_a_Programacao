import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        String nome;
        double nota;
        double media;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Insira o nome do aluno: ");
            nome = sc.nextLine();
            while (!nome.equals("fim")) {
                System.out.printf("Insira a Nota 1 de %s: ", nome);
                nota = sc.nextDouble();
                System.out.printf("Insira a Nota 2 de %s: ", nome);
                nota += sc.nextDouble();
                media = nota / 2;
                System.out.printf("A média do(a) %s é %.2f %n", nome, media);
                sc.nextLine();
                System.out.printf("Insira o nome do aluno: ");
                nome = sc.nextLine();
            }
        }
    }
}
