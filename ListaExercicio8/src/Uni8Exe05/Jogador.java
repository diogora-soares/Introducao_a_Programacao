public class Jogador {
    String nome;
    int[] pontuacoes;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacoes = new int[3];
    }

    public void registrarPontuacao(int rodada, int pontos) {
        if (rodada < 0 || rodada > 2) {
            System.out.println("Rodada inválida!");
        } else {
            pontuacoes[rodada] = pontos;
        }
    }

    public int totalPontos() {
        int total = 0;
        for (int i = 0; i < pontuacoes.length; i++) total += pontuacoes[i];
        return total;
    }

    public double mediaPontos() {
        return totalPontos() / 3.0;
    }

    public int melhorRodada() {
        int melhor = 0;
        for (int i = 1; i < pontuacoes.length; i++) {
            if (pontuacoes[i] > pontuacoes[melhor]) melhor = i;
        }
        return melhor + 1; // retorna 1, 2 ou 3
    }

    public String classificacao() {
        int total = totalPontos();
        if (total >= 2500) return "Ouro 🥇";
        else if (total >= 1500) return "Prata 🥈";
        else if (total >= 800)  return "Bronze 🥉";
        else return "Sem classificação";
    }
}
