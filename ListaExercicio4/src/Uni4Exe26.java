import java.util.Scanner;

/*
 * Exercício 26
 * Cálculo de áreas geométricas com base na opção do usuário
 */
public class Uni4Exe26 {

    public static void main(String[] args) {

        // Declaração das variáveis
        char opcao;
        double resultado = 0;

        try (Scanner sc = new Scanner(System.in)) {

            // Menu de opções
            System.out.println("Digite 'T' para calcular a área de um triângulo");
            System.out.println("Digite 'Q' para calcular a área de um quadrado");
            System.out.println("Digite 'R' para calcular a área de um retângulo");
            System.out.println("Digite 'C' para calcular a área de um Círculo");

            // Leitura da opção (convertendo para maiúsculo)
            opcao = Character.toUpperCase(sc.next().charAt(0));

            // Estrutura de decisão
            switch (opcao) {

                case 'T' -> {
                    // Triângulo: (base * altura) / 2
                    double baseT;
                    double alturaT;

                    // Entrada da base
                    while (true) {
                        System.out.println("Informe a base: ");

                        if (sc.hasNextDouble()) {
                            baseT = sc.nextDouble();
                            if (baseT > 0) {
                                break;
                            }
                        } else {
                            sc.next();
                        }

                        System.out.println("Deve informar um número positivo");
                    }

                    // Entrada da altura
                    while (true) {
                        System.out.println("Informe a altura: ");

                        if (sc.hasNextDouble()) {
                            alturaT = sc.nextDouble();
                            if (alturaT > 0) {
                                break;
                            }
                        } else {
                            sc.next();
                        }

                        System.out.println("Deve informar um número positivo");
                    }

                    resultado = (baseT * alturaT) / 2;
                }

                case 'Q' -> {
                    // Quadrado: lado²
                    double lado;

                    while (true) {
                        System.out.println("Informe o lado: ");

                        if (sc.hasNextDouble()) {
                            lado = sc.nextDouble();
                            if (lado > 0) {
                                break;
                            }
                        } else {
                            sc.next();
                        }

                        System.out.println("Deve informar um número positivo");
                    }

                    resultado = Math.pow(lado, 2);
                }

                case 'R' -> {
                    // Retângulo: base * altura
                    double baseR;
                    double alturaR;

                    // Base
                    while (true) {
                        System.out.println("Informe a base: ");

                        if (sc.hasNextDouble()) {
                            baseR = sc.nextDouble();
                            if (baseR > 0) {
                                break;
                            }
                        } else {
                            sc.next();
                        }

                        System.out.println("Deve informar um número positivo");
                    }

                    // Altura
                    while (true) {
                        System.out.println("Informe a altura: ");

                        if (sc.hasNextDouble()) {
                            alturaR = sc.nextDouble();
                            if (alturaR > 0) {
                                break;
                            }
                        } else {
                            sc.next();
                        }

                        System.out.println("Deve informar um número positivo");
                    }

                    resultado = baseR * alturaR;
                }

                case 'C' -> {
                    // Círculo: π * raio²
                    double raio;

                    while (true) {
                        System.out.println("Informe o raio: ");

                        if (sc.hasNextDouble()) {
                            raio = sc.nextDouble();
                            if (raio > 0) {
                                break;
                            }
                        } else {
                            sc.next();
                        }

                        System.out.println("Deve informar um número positivo");
                    }

                    resultado = Math.PI * Math.pow(raio, 2);
                }

                default -> {
                    // Caso opção inválida
                    System.out.println("Valor inválido");
                }
            }

            // Saída final
            System.out.println("Reslutado: " + resultado);
        }
    }
}