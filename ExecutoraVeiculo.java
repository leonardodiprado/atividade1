package Atividade;

import java.util.Scanner;

public class ExecutoraVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a marca do veículo? ");
        String marca = scanner.nextLine();

        System.out.println("Qual o modelo do veículo? ");
        String modelo = scanner.nextLine();

        System.out.println("Qual o ano do veículo? ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual a cor do veículo? ");
        String cor = scanner.nextLine();

        System.out.println("Quantas portas tem o carro? ");
        int numeroPortas = scanner.nextInt();

        System.out.println("O carro possui transmissão automática? (true/false): ");
        boolean tipoTransmissao = scanner.nextBoolean();

        System.out.println("O carro possui quantos quilometros rodados? ");
        double quilometragem = scanner.nextDouble();

        Carro carro = new Carro(marca, modelo, ano, cor, numeroPortas, tipoTransmissao, quilometragem);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Exibir detalhes do veículo");
            System.out.println("2. Ligar o veículo");
            System.out.println("3. Desligar o veículo");
            System.out.println("4. Acelerar o carro");
            System.out.println("5. Frear o carro");
            System.out.println("6. Estacionar o carro");
            System.out.println("7. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.exibirDetalhes();
                    break;
                case 2:
                    carro.ligar();
                    break;
                case 3:
                    carro.desligar();
                    break;
                case 4:
                    carro.acelerar();
                    break;
                case 5:
                    carro.frear();
                    break;
                case 6:
                    carro.estacionar();
                    break;
                case 7:
                    System.out.println("Saindo.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente outro número de 1 a 6.");
            }
        } while (opcao != 7);

        scanner.close();
    }
}