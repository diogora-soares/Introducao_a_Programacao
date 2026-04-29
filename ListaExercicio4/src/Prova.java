
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        String nomeUsuario;
        int opcaoClasse = 0;
        double pesoBagagem;
        double franquia = 0.0;
        double tarifa = 0.0;
        double taxaAdicional = 0.0;
        String nomeClasse = "0";

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        nomeUsuario = sc.nextLine();
        while (opcaoClasse < 1 || opcaoClasse > 3) {
            System.out.println("Escolha uma classe ( 1-Econômica | 2-Executiva | 3-Primeira Classe ) ");
            opcaoClasse = sc.nextInt();
            switch (opcaoClasse) {
                case 1:
                    nomeClasse = "Econômica";
                    franquia = 23.0;
                    tarifa = 15.0;
                    break;
                case 2:
                    nomeClasse = "Executiva";
                    franquia = 32.0;
                    tarifa = 10.0;
                    break;
                case 3:
                    nomeClasse = "Primeira Classe";
                    franquia = 46.0;
                    tarifa = 7.0;
                    break;
                default:
                    System.out.println("Classe não Existe. Tente Novamente");
            }
        }
        System.out.println("Insira o peso da bagagem em Kg: ");
        pesoBagagem = sc.nextDouble();
        System.out.printf(
                " -- Check-in VooBem --%nPassageiro: %s %nClasse: %s %nFranquia: %.1f kg %nPeso da bagagem: %.1f kg %nStatus: ",
                nomeUsuario, nomeClasse, franquia, pesoBagagem);

        if (pesoBagagem > franquia) {
            double pesoExcedente = pesoBagagem - franquia;
            taxaAdicional = pesoExcedente * tarifa;
            System.out.printf(
                    "Bagagem excedente %nExcesso: %.1f kg %nTaxa adicional: R$%.2f %nDirija-se ao caixa para pagamento",
                    pesoExcedente, taxaAdicional);
        } else {
            System.out.printf("Dentro do limite %nTaxa adicional R$%.2f %nBoa viagem", taxaAdicional);
        }
    }
}
