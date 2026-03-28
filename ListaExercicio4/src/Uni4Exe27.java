/*
    1ª e 2ª hora - R$ 5,00 cada  
    3ª e 4ª hora - R$ 7,50 cada  
    5ª hora e seguintes - R$ 10,00 cada  

    O número de horas a pagar é sempre inteiro e arredondado para
    cima ou para baixo dependendo do tempo. Até 29 minutos depois
    da chegada, arredonda-se para baixo e após 30 minutos 
    arredonda-se para cima. Por exemplo, quem estacionar durante 
    1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 
    hora e 35 minutos pagará por duas horas. Entretanto, se a 
    pessoa permaneceu menos de 30 minutos, também pagará por uma 
    hora. Os horários de chegada e partida são apresentados na 
    forma de pares de inteiros, representando horas e minutos. Por
    exemplo, o par 12 50 representará meio dia e cinquenta. Assim, 
    faça um algoritmo que leia os horários de chegada e de partida 
    e escreva na tela o tempo que ficou estacionado, e o preço a ser 
    cobrado. Deverá haver validação de dados. Admite-se que a chegada
    e a partida se dão com intervalo não superior a 24 horas, e sempre 
    chegam e saem no mesmo dia.  
 */

import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        int horaChegada;
        int minutoChegada;
        int chegadaTotal;
        int horaSaida;
        int minutoSaida;
        int saidaTotal;
        int duracao;
        int horas;
        double tarifa1 = 5.0;
        double tarifa2 = 7.5;
        double tarifa3 = 10.0;
        double debito = 0.0;

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Insira a hora de chegada: ");
                if (sc.hasNextInt()) {
                    horaChegada = sc.nextInt();
                    if (horaChegada >= 0 && horaChegada < 24) {
                        break;
                    }
                } else {
                    sc.next();
                }
                System.err.println("Erro! Hora de chegada deve ser um inteiro entre 0 e 23 ");
            }

            while (true) {
                System.out.println("Insira os minutos de chegada: ");
                if (sc.hasNextInt()) {
                    minutoChegada = sc.nextInt();
                    if (minutoChegada >= 0 && minutoChegada < 60) {
                        break;
                    }
                } else {
                    sc.next();
                }
                System.err.println("Erro! Minutos de chegada deve ser um inteiro entre 0 e 59 ");
            }

            while (true) {
                System.out.println("Insira a hora de saída: ");
                if (sc.hasNextInt()) {
                    horaSaida = sc.nextInt();
                    if (horaSaida >= 0 && horaSaida < 24 && horaSaida >= horaChegada) {
                        break;
                    }
                } else {
                    sc.next();
                }
                System.err.println("Erro! Hora de saída deve ser entre 0 e 23 e não anterior à hora de chegada");
            }

            while (true) {
                System.out.println("Insira os minutos de saída: ");
                if (sc.hasNextInt()) {
                    minutoSaida = sc.nextInt();
                    if (minutoSaida >= 0 && minutoSaida < 60) {
                        if (horaSaida > horaChegada || (horaSaida == horaChegada && minutoSaida >= minutoChegada)) {
                            break;
                        }
                    }
                } else {
                    sc.next();
                }
                System.err.println("Erro! Minuto inválido ou horário de saída anterior ao de entrada");
            }
            chegadaTotal = (horaChegada * 60) + minutoChegada;
            saidaTotal = (horaSaida * 60) + minutoSaida;
            duracao = saidaTotal - chegadaTotal;
            horas = duracao / 60;
            if (((duracao % 60) >= 30) || horas == 0) {
                horas++;
            }

            while (horas > 4) {
                horas--;
                debito += tarifa3;
            }
            while (horas > 2) {
                horas--;
                debito += tarifa2;
            }
            while (horas > 0) {
                horas--;
                debito += tarifa1;
            }
            System.out.printf("Preço cobrado = R$%.2f", debito);
        }
    }
}