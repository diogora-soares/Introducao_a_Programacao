import java.util.Scanner;

public class Uni8Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];

        System.out.println("=== CADASTRO ===");
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + " - Nome: ");
            String nome = sc.nextLine();
            System.out.print("Aluno " + (i + 1) + " - Nota: ");
            double nota = Double.parseDouble(sc.nextLine());
            alunos[i] = new Aluno(nome, nota);
        }

        System.out.println("\n=== RESULTADO ===");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].nome + " - " + alunos[i].nota + " - " + alunos[i].situacao());
        }

        sc.close();
    }
}
