package br.passagensaereas.fag;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do {
            System.out.println("\n\nBem vindo a venda de passagens aéreas!\n");
            System.out.println("1- Exibir destinos");
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

