
/*
    Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

- “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
- “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
- “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência 
deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;

- “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor 
ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;

- “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
- “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
- “7 – Inverter valores”: desafio (ver abaixo);  
- “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.

Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.  
Para a opção "6 - Ordenar valores" se pode usar o "método bolha" explicado neste [vídeo](https://furb-my.sharepoint.com/:v:/g/personal/dalton_furb_br/EVyXhyhfMCxOjjJRsle-OzgBE1LlUgc-ZCWYvTlCPa0gyA?e=HZAWSm). Existem também outros vídeos que mostram a lógica de ordenação usando o "método bolha", no caso é só procurar por "Bubble Sort". Um deles é [Bubble Sort | GeeksforGeeks](<https://www.youtube.com/watch?v=nmhjrI-aW5o> "Bubble Sort | GeeksforGeeks"). Um outro um pouco mais "divertido" procura mostrar a lógica usando uma coreografia de dança: [Bubble sort with Hungarian, folk dance](https://www.youtube.com/watch?v=Iv3vgjM8Pv4 "Bubble sort with Hungarian, folk dance"). E, por fim, tem uma forma interativa e visual com explicação em: <https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/>.  

**Desafio:** adapte o código acima para ter mais uma opção no menu para também poder inverter os elementos dentro de um vetor. Assim o último 
elemento passa a ser o primeiro, o penúltimo passa ser o segundo, e assim sucessivamente para todos os elementos da lista. Mas lembre, não se 
deve considerar o vetor inteiro, mas somente os elementos que já foram adicionados no vetor.

*/

import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        int opcao;
        int[] vetor = new int[50];
        int tamanho = 0; // quantidade de posições ocupadas no vetor
        try (Scanner sc = new Scanner(System.in)) {
            do {
                exibirMenu();
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1 -> tamanho = incluirValor(sc, vetor, tamanho);
                    case 2 -> pesquisarValor(sc, vetor, tamanho);
                    case 3 -> alterarValor(sc, vetor, tamanho);
                    case 4 -> tamanho = excluirValor(sc, vetor, tamanho);
                    case 5 -> mostrarValores(vetor, tamanho);
                    case 6 -> ordenarValores(vetor, tamanho);
                    case 7 -> inverterValores(vetor, tamanho);
                    case 8 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 8);
        }
    }

    public static void exibirMenu() {
        System.out.printf("%n============== MENU ==============%n");
        System.out.printf("| %-2s | %-25s |%n", 1, "Incluir valor");
        System.out.printf("| %-2s | %-25s |%n", 2, "Pesquisar valor");
        System.out.printf("| %-2s | %-25s |%n", 3, "Alterar valor");
        System.out.printf("| %-2s | %-25s |%n", 4, "Excluir valor");
        System.out.printf("| %-2s | %-25s |%n", 5, "Mostrar valores");
        System.out.printf("| %-2s | %-25s |%n", 6, "Ordenar valores");
        System.out.printf("| %-2s | %-25s |%n", 7, "Inverter valores");
        System.out.printf("| %-2s | %-25s |%n", 8, "Sair do sistema");
        System.out.println("==================================");
        System.out.print("Escolha uma opção: ");
    }

    // Retorna o novo tamanho após inserção
    public static int incluirValor(Scanner sc, int[] vetor, int tamanho) {
        if (tamanho >= vetor.length) {
            System.out.println("Vetor cheio! Não foi possível incluir o valor.");
            return tamanho;
        }
        System.out.print("Informe o valor a incluir: ");
        vetor[tamanho] = sc.nextInt();
        tamanho++;
        System.out.println("Valor incluído com sucesso!");
        return tamanho;
    }

    public static void pesquisarValor(Scanner sc, int[] vetor, int tamanho) {
        System.out.print("Informe o valor a pesquisar: ");
        int valor = sc.nextInt();
        for (int idx = 0; idx < tamanho; idx++) {
            if (vetor[idx] == valor) {
                System.out.printf("Valor %d encontrado na posição %d.%n", valor, idx);
                return;
            }
        }
        System.out.printf("Valor %d não encontrado no vetor.%n", valor);
    }

    // Altera apenas a primeira ocorrência
    public static void alterarValor(Scanner sc, int[] vetor, int tamanho) {
        System.out.print("Informe o valor a alterar: ");
        int valorAntigo = sc.nextInt();
        System.out.print("Informe o novo valor: ");
        int valorNovo = sc.nextInt();
        for (int idx = 0; idx < tamanho; idx++) {
            if (vetor[idx] == valorAntigo) {
                vetor[idx] = valorNovo;
                System.out.printf("Valor %d alterado para %d com sucesso!%n", valorAntigo, valorNovo);
                return;
            }
        }
        System.out.printf("Número %d não encontrado.%n", valorAntigo);
    }

    // Retorna o novo tamanho após exclusão
    public static int excluirValor(Scanner sc, int[] vetor, int tamanho) {
        System.out.print("Informe o valor a excluir: ");
        int valor = sc.nextInt();
        for (int idx = 0; idx < tamanho; idx++) {
            if (vetor[idx] == valor) {
                // Desloca todos os elementos seguintes uma posição para a esquerda
                for (int j = idx; j < tamanho - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                tamanho--;
                System.out.printf("Valor %d excluído com sucesso!%n", valor);
                return tamanho;
            }
        }
        System.out.printf("Valor %d não encontrado no vetor.%n", valor);
        return tamanho;
    }

    public static void mostrarValores(int[] vetor, int tamanho) {
        if (tamanho == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }
        System.out.print("Valores: ");
        for (int idx = 0; idx < tamanho; idx++) {
            System.out.print(vetor[idx]);
            if (idx < tamanho - 1)
                System.out.print(", ");
        }
        System.out.println();
    }

    // Bubble sort crescente
    public static void ordenarValores(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int guardaValor = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = guardaValor;
                }
            }
        }
        System.out.println("Vetor ordenado com sucesso!");
    }

    // Troca elementos das pontas em direção ao centro
    public static void inverterValores(int[] vetor, int tamanho) {
        for (int idx = 0; idx < tamanho / 2; idx++) {
            int guardaValor = vetor[idx];
            vetor[idx] = vetor[tamanho - 1 - idx];
            vetor[tamanho - 1 - idx] = guardaValor;
        }
        System.out.println("Vetor invertido com sucesso!");
    }
}