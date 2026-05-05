
import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) {
        String nomeVendedor;
        int quantidade, n;
        double precoUnitario;
        double totalVendas;
        double salario;
        final double porcentagemComissao = 0.3;
        char opcao = 's';

        try (Scanner sc = new Scanner(System.in)) {

            while (opcao != 'n') {

                System.out.print("Digite o nome do vendedor: ");
                nomeVendedor = sc.next();

                System.out.print("Digite o número de produtos vendidos: ");
                n = sc.nextInt();

                totalVendas = 0;

                for (int i = 1; i <= n; i++) {
                    System.out.println("Produto " + i);

                    System.out.print("Preço unitário: ");
                    precoUnitario = sc.nextDouble();

                    System.out.print("Quantidade vendida: ");
                    quantidade = sc.nextInt();

                    totalVendas += precoUnitario * quantidade;
                }

                salario = totalVendas * porcentagemComissao;

                System.out.printf("%n--- RELATÓRIO ---%n");
                System.out.printf("Vendedor: %s%n", nomeVendedor);
                System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
                System.out.printf("Salário: R$ %.2f%n", salario);

                System.out.print("%nDeseja digitar os dados de mais um vendedor? (s/n): ");
                opcao = sc.next().toLowerCase().charAt(0);
            }

        }
    }
}
