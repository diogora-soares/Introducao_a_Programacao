import java.util.Scanner;

public class Uni8Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto[] produtos = {
            new Produto("Fone Bluetooth",   89.90,  2),
            new Produto("Mouse Gamer",     149.90, 15),
            new Produto("Teclado Mec.",    299.90,  1),
            new Produto("Monitor 24\"",    899.90,  8),
            new Produto("Webcam HD",       179.90,  3),
            new Produto("SSD 480GB",       249.90, 12),
            new Produto("Headset Gamer",   199.90,  5),
            new Produto("Mousepad XL",      49.90,  0)
        };

        int opcao;
        while (true) {
            System.out.println("\n=== ESTOQUE ===");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Vender");
            System.out.println("3 - Repor estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.printf("\n%-4s| %-16s| %-10s| %s%n", "Cód", "Produto", "Preço", "Estoque");
                    for (int i = 0; i < produtos.length; i++) {
                        Produto p = produtos[i];
                        String baixo = p.estaEmBaixa() ? " ⚠ BAIXO" : "";
                        System.out.printf("%-4d| %-16s| R$ %-7.2f| %d%s%n",
                            i + 1, p.nome, p.preco, p.estoque, baixo);
                    }
                    break;

                case 2:
                case 3:
                    System.out.print("Código do produto: ");
                    int cod = Integer.parseInt(sc.nextLine());
                    if (cod < 1 || cod > 8) {
                        System.out.println("Código inválido!");
                    } else {
                        System.out.print("Quantidade: ");
                        int qtd = Integer.parseInt(sc.nextLine());
                        if (opcao == 2) {
                            produtos[cod - 1].vender(qtd);
                        } else {
                            produtos[cod - 1].repor(qtd);
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        System.out.println("Encerrando sistema.");
        sc.close();
    }
}
