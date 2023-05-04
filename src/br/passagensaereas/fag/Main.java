package br.passagensaereas.fag;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int opc = 0;

        System.out.print("\nBem vindo ao aeroporto Gheno's Companny!\n");
        System.out.println("Deseja entrar como Passageiro ou Funcionário? (P/F)");
        String respostas = input.nextLine();

        if (respostas.equalsIgnoreCase("P")) {
            System.out.println("\nBem vindo passageiro!");
        } else {
            System.out.println("Bem vindo funcionário, tenha um Bom trabalho!");
            System.exit(0);
        }

        System.out.println("\n\nDeseja comprar passagens aéreas? (S/N)");
        String resposta = input.nextLine();


        String nome = null;
        String email = null;
        String telefone = null;
        String rua = null;
        String pais = null;
        String estado = null;
        String cidade = null;
        String CEP = null;
        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("\nPerfeito, antes disso vamos precisar de algumas informações!\n");

            System.out.println("Digite seu nome:");
            nome = input.nextLine();

            System.out.println("Digite seu email:");
            email = input.nextLine();

            System.out.println("Digite seu telefone:");
            telefone = input.nextLine();

            System.out.println("Digite sua rua:");
            rua = input.nextLine();

            System.out.println("Digite seu bairro:");
            String bairro = input.nextLine();

            System.out.println("Digite seu cidade:");
            cidade = input.nextLine();

            System.out.println("Digite seu CEP: ");
            CEP = input.nextLine();

            System.out.println("Digite seu estado:");
            estado = input.nextLine();

            System.out.println("Digite seu país:");
            pais = input.nextLine();

        } else if (resposta.equalsIgnoreCase("N")) {
            System.out.println("Que pena, até breve...");
            System.exit(0);
        }

        Scanner scanners = new Scanner(System.in);

        double taxaPorKg = 2.50;

        Bagagem bagagem = new Bagagem();

        System.out.print("Insira o peso da bagagem em kg: ");
        double peso = scanners.nextDouble();

        bagagem.setPeso(peso);

        double preco = peso * taxaPorKg;

        System.out.printf("O peso da bagagem é %.2f kg e o preço é R$ %.2f", peso, preco);
        System.out.println("\n\nNome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Rua: " + rua);
        System.out.println("Estado: " + estado);
        System.out.println("País: " + pais);
        System.out.println("Cidade: " + cidade);
        System.out.println("Cep: "+ CEP);


        do {
            System.out.println("\n1- Exibir destinos");
            System.out.println("2- Planejar Viagem");
            System.out.println("0- Sair");
            System.out.print("\nEscolha uma opção: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Bilhete.exibirDestinos();
                    break;
                case 2:
                    Bilhete.planejarViagem();
                    break;
            }
        } while (opc != 0);
        sc.close();

    }
}

