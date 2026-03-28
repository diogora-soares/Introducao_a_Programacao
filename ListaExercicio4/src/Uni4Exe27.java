/*
 * Exercício 27
 * Cálculo de estacionamento com base no tempo de permanência
 * 
 * Regras:
 * - 1ª e 2ª hora: R$ 5,00 cada
 * - 3ª e 4ª hora: R$ 7,50 cada
 * - 5ª hora em diante: R$ 10,00 cada
 * 
 * Arredondamento:
 * - Até 29 min → não soma hora
 * - 30 min ou mais → soma 1 hora
 * - Menos de 30 min → cobra 1 hora mínima
 */

import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {

        // Horário de chegada
        int horaChegada;
        int minutoChegada;
        int chegadaTotal; // total em minutos

        // Horário de saída
        int horaSaida;
        int minutoSaida;
        int saidaTotal; // total em minutos

        // Cálculo de duração
        int duracao; // duração em minutos
        int horas;   // duração convertida em horas (com arredondamento)
        int horasCobradas;  // horas para debitar

        // Tarifas
        double tarifa1 = 5.0;   // 1ª e 2ª hora
        double tarifa2 = 7.5;   // 3ª e 4ª hora
        double tarifa3 = 10.0;  // 5ª em diante

        double debito = 0.0; // valor total a pagar

        try (Scanner sc = new Scanner(System.in)) {

            // ============================
            // Entrada da hora de chegada
            // ============================
            while (true) {
                System.out.println("Insira a hora de chegada: ");

                if (sc.hasNextInt()) {
                    horaChegada = sc.nextInt();

                    // Validação: deve ser entre 0 e 23
                    if (horaChegada >= 0 && horaChegada < 24) {
                        break;
                    }
                } else {
                    sc.next(); // descarta entrada inválida
                }

                System.err.println("Erro! Hora de chegada deve ser um inteiro entre 0 e 23 ");
            }

            // ============================
            // Entrada dos minutos de chegada
            // ============================
            while (true) {
                System.out.println("Insira os minutos de chegada: ");

                if (sc.hasNextInt()) {
                    minutoChegada = sc.nextInt();

                    // Validação: 0 a 59
                    if (minutoChegada >= 0 && minutoChegada < 60) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Erro! Minutos de chegada deve ser um inteiro entre 0 e 59 ");
            }

            // ============================
            // Entrada da hora de saída
            // ============================
            while (true) {
                System.out.println("Insira a hora de saída: ");

                if (sc.hasNextInt()) {
                    horaSaida = sc.nextInt();

                    // Deve ser válida e não pode ser antes da chegada
                    if (horaSaida >= 0 && horaSaida < 24 && horaSaida >= horaChegada) {
                        break;
                    }
                } else {
                    sc.next();
                }

                System.err.println("Erro! Hora de saída deve ser entre 0 e 23 e não anterior à hora de chegada");
            }

            // ============================
            // Entrada dos minutos de saída
            // ============================
            while (true) {
                System.out.println("Insira os minutos de saída: ");

                if (sc.hasNextInt()) {
                    minutoSaida = sc.nextInt();

                    // Validação completa do horário de saída
                    if (minutoSaida >= 0 && minutoSaida < 60) {

                        // Garante que saída não seja antes da chegada
                        if (horaSaida > horaChegada || 
                           (horaSaida == horaChegada && minutoSaida >= minutoChegada)) {
                            break;
                        }
                    }
                } else {
                    sc.next();
                }

                System.err.println("Erro! Minuto inválido ou horário de saída anterior ao de entrada");
            }

            // ============================
            // Conversão para minutos totais
            // ============================
            chegadaTotal = (horaChegada * 60) + minutoChegada;
            saidaTotal = (horaSaida * 60) + minutoSaida;

            // Duração total em minutos
            duracao = saidaTotal - chegadaTotal;

            // Converte para horas inteiras
            horas = duracao / 60;

            // ============================
            // Regra de arredondamento
            // ============================
            horasCobradas = horas;

            if (((duracao % 60) >= 30) || horasCobradas == 0) {
                horasCobradas++; // arredonda para cima ou mínimo de 1 hora
            }

            // ============================
            // Cálculo do valor
            // ============================


            // 5ª hora em diante
            while (horasCobradas > 4) {
                horasCobradas--;
                debito += tarifa3;
            }

            // 3ª e 4ª hora
            while (horasCobradas > 2) {
                horasCobradas--;
                debito += tarifa2;
            }

            // 1ª e 2ª hora
            while (horasCobradas > 0) {
                horasCobradas--;
                debito += tarifa1;
            }

            // ============================
            // Saída final
            // ============================
            System.out.printf("Ficou estacionado por %d hora e %d minutos %n", horas, (duracao % 60));
            System.out.printf("Preço cobrado = R$%.2f", debito);
        }
    }
}