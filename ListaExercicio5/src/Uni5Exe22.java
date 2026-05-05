/*
    Um funcionário recebe aumento anual. Em 1995 foi contratado por 
    2000 reais. Em 1996 recebeu aumento de 1.5%. A partir de 1997, 
    os aumentos sempre correspondem ao dobro do ano anterior. Faça 
    programa que determine o salário atual do funcionário.
*/

public class Uni5Exe22 {
    public static void main(String[] args) {
        int ano = 1995;
        double salario= 2000.0;
        double aumento = 0.015;

        ano++;
        salario *= (1 + aumento);

        while (ano < 2026) { 
            aumento *= 2;
            salario *= (1 + aumento);
            ano++;
        }
        System.out.printf("Salário atual do funcionário é de: %.2f",salario);
    }
}
