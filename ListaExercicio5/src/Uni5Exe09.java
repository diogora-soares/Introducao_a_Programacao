
import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) {
        int n;
        String nome;
        String nome18 = "";
        int idade;
        int contadorMaisDeVinte = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Informe quantos alunos deseja inserir: ");
            n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.printf("Informe o nome do aluno: ");
                nome = sc.nextLine();
                System.out.printf("Informe a idade do aluno: ");
                idade = sc.nextInt();
                sc.nextLine();

                if (idade == 18) {
                    if (nome18.isEmpty()) {
                        nome18 = nome;
                    } else {
                        nome18 += " e " + nome;
                    }
                }
                if (idade > 20) {
                    contadorMaisDeVinte++;
                }
            }
            System.out.printf("Nomes dos alunos que tem 18 anos: %s%n", nome18);
            System.out.printf("Quantidade de alunos que tem idade acima de 20 anos: %d", contadorMaisDeVinte);
        }
    }
}
