package br.passagensaereas.fag;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc=0;
        System.out.println("\n\nBem vindo a venda de passagens aéreas!\n");
        Scanner scanner = new Scanner(System.in);

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

