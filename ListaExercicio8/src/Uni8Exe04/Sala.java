public class Sala {
    int numero;
    boolean[][] assentos;

    public Sala(int numero) {
        this.numero = numero;
        this.assentos = new boolean[4][6];
    }

    public void exibirMapa() {
        System.out.println("\n=== SALA " + numero + " ===");
        System.out.print("    ");
        for (int c = 1; c <= 6; c++) System.out.print(c + "   ");
        System.out.println();
        for (int f = 0; f < 4; f++) {
            char fileira = (char) ('A' + f);
            System.out.print(fileira + " ");
            for (int c = 0; c < 6; c++) {
                System.out.print(assentos[f][c] ? "[X] " : "[ ] ");
            }
            System.out.println();
        }
        System.out.printf("Ocupação: %.1f%%%n", percentualOcupacao());
    }

    public void reservar(int fileira, int coluna) {
        if (assentos[fileira][coluna]) {
            System.out.println("Assento já ocupado!");
        } else {
            assentos[fileira][coluna] = true;
            System.out.println("Reserva confirmada!");
        }
    }

    public void cancelar(int fileira, int coluna) {
        if (!assentos[fileira][coluna]) {
            System.out.println("Assento já está livre!");
        } else {
            assentos[fileira][coluna] = false;
            System.out.println("Reserva cancelada!");
        }
    }

    public double percentualOcupacao() {
        int ocupados = 0;
        for (int lin = 0; lin < 4; lin++) {
            for (int col = 0; col < 6; col++) {
                if (assentos[lin][col]) ocupados++;
            }
        }
        return (ocupados / 24.0) * 100;
    }
}
