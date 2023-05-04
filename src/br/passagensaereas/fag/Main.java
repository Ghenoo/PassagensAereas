package br.passagensaereas.fag;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int opc=0;

        System.out.print("\nBem vindo ao aeroporto Gheno's Companny!\n");
        System.out.println("Deseja entrar como Passageiro ou Funcionário? (P/F)");
        String respostas = input.nextLine();

        if (respostas.equalsIgnoreCase("P")){
            System.out.println("\nBem vindo passageiro!");
        } else{
            System.out.println("Bem vindo funcionário, tenha um Bom trabalho!");
            System.exit(0);
        }

        System.out.println("\n\nDeseja comprar passagens aéreas? (S/N)");
        String resposta = input.nextLine();

        if (resposta.equalsIgnoreCase("S")){
            System.out.println("\nPerfeito, antes disso vamos precisar de algumas informações!\n");

            System.out.println("Digite seu nome:");
            String nome = input.nextLine();

            System.out.println("Digite seu email:");
            String email = input.nextLine();

            System.out.println("Digite seu telefone:");
            String telefone = input.nextLine();

            System.out.println("Digite sua rua:");
            String rua = input.nextLine();

            System.out.println("Digite seu bairro:");
            String bairro = input.nextLine();

            System.out.println("Digite seu estado:");
            String estado = input.nextLine();

            System.out.println("Digite seu país:");
            String pais = input.nextLine();

            Pessoa pessoa = new Pessoa(nome, email, telefone, rua, bairro, estado, pais);
        }
        else if (resposta.equalsIgnoreCase("N")){
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

