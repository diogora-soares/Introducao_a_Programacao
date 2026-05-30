import java.util.Scanner;

public class Uni8Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido[] comanda = new Pedido[10];
        int totalPedidos = 0;
        int opcao;

        do {
            System.out.println("\n=== LANCHONETE ===");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Ver comanda");
            System.out.println("0 - Fechar e pagar");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    if (totalPedidos >= 10) {
                        System.out.println("Comanda cheia!");
                        break;
                    }
                    System.out.println("\nCardápio:");
                    System.out.println("1 - X-Burger (R$ 18.50)");
                    System.out.println("2 - X-Salada (R$ 16.00)");
                    System.out.println("3 - Suco Natural (R$ 8.00)");
                    System.out.print("Item: ");
                    int item = Integer.parseInt(sc.nextLine());
                    System.out.print("Quantidade: ");
                    int qtd = Integer.parseInt(sc.nextLine());

                    String nomeItem = "";
                    double preco = 0;
                    switch (item) {
                        case 1: nomeItem = "X-Burger";     preco = 18.50; break;
                        case 2: nomeItem = "X-Salada";     preco = 16.00; break;
                        case 3: nomeItem = "Suco Natural"; preco =  8.00; break;
                        default: System.out.println("Item inválido!"); break;
                    }
                    if (!nomeItem.isEmpty()) {
                        comanda[totalPedidos++] = new Pedido(nomeItem, qtd, preco);
                        System.out.println("Adicionado!");
                    }
                    break;

                case 2:
                    System.out.println("\n=== COMANDA ===");
                    double total = 0;
                    for (int i = 0; i < totalPedidos; i++) {
                        double sub = comanda[i].calcularTotal();
                        System.out.printf("%s x%d = R$ %.2f%n", comanda[i].nomeItem, comanda[i].quantidade, sub);
                        total += sub;
                    }
                    System.out.printf("TOTAL: R$ %.2f%n", total);
                    break;

                case 0:
                    double totalFinal = 0;
                    for (int i = 0; i < totalPedidos; i++) totalFinal += comanda[i].calcularTotal();
                    System.out.printf("Total a pagar: R$ %.2f%n", totalFinal);
                    System.out.println("Obrigado, volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
