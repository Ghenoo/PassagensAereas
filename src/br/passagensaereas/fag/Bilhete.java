package br.passagensaereas.fag;

import java.util.Scanner;
public class Bilhete {
    public static String[]destinos = new String[100];
    public static double[]custos = new double[100];
    public static String[]horarios = new String[100];
    public static String[]horarios1 = new String[100];
    public static String[]ida = new String[100];
    public static String[]vtida = new String[100];

    public static void exibirDestinos(){
        //alocação de destinos
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 100; i++) {
            System.out.println("");
        }
        System.out.println("Destinos disponíveis no momento");
        destinos[0] = "1 - São Paulo";
        destinos[1] = "2 - Fortaleza";
        destinos[2] = "3 - Curitiba";
        destinos[3] = "4 - Gramado";
        destinos[4] = "5 - Salvador";
        destinos[5] = "6 - Bahia\n\n";
        for(String pontos: destinos){
            if(pontos != null){
                System.out.println(pontos);
            }
        }
        int cont;
        System.out.println("Tecle 1 para continuar: ");
        cont = sc.nextInt();

        for(int i = 0; i < 50; i++) {
            System.out.println("");
        }

    }

    public static void horariosIda(){
        //alocação de destinos
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 100; i++) {
            System.out.println("");
        }
        System.out.println("Horarios disponíveis no momento");
        horarios[0] = "1 - 10h";
        horarios[1] = "2 - 13h";
        horarios[2] = "3 - 15h";
        horarios[3] = "4 - 18h";
        horarios[4] = "5 - 21h";
        horarios[5] = "6 - 23h\n\n";
        for(String pontos: horarios){
            if(pontos != null){
                System.out.println(pontos);
            }
        }
    }

    public static void horariosIdaV(){
        //alocação de destinos
        for(int i = 0; i < 100; i++) {
            System.out.println("");
        }
        System.out.println("Horarios disponíveis no momento");
        horarios1[0] = "1 - 09h30 - 23h";
        horarios1[1] = "2 - 12h - 16h";
        horarios1[2] = "3 - 13h - 21h";
        horarios1[3] = "4 - 18h - 22h";
        horarios1[4] = "5 - 20h - 08h";
        horarios1[5] = "6 - 22h - 15h\n\n";
        for(String pontos: horarios1){
            if(pontos != null){
                System.out.println(pontos);
            }
        }
    }

    public static void DataIda1(){
        //alocação de destinos
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 100; i++) {
            System.out.println("");
        }
        System.out.println("Datas disponíveis no momento");
        ida[0] = "1 - 20/07";
        ida[1] = "2 - 24/07";
        ida[2] = "3 - 02/08";
        ida[3] = "4 - 15/08";
        ida[4] = "5 - 10/09";
        ida[5] = "6 - 20/09\n\n";
        for(String pontos: ida){
            if(pontos != null){
                System.out.println(pontos);
            }
        }
    }

    public static void DataIdaVolta(){
        //alocação de destinos
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 100; i++) {
            System.out.println("");
        }
        System.out.println("Datas disponíveis no momento");
        vtida[0] = "1 - 18/07 - 22/07";
        vtida[1] = "2 - 23/07 - 28/07";
        vtida[2] = "3 - 01/08 - 05/08";
        vtida[3] = "4 - 11/08 - 20/08";
        vtida[4] = "5 - 14/09 - 18/09";
        vtida[5] = "6 - 25/09 - 28/09\n\n";
        for(String pontos: vtida){
            if(pontos != null){
                System.out.println(pontos);
            }
        }
    }

    public static int planejarViagem(){
        Scanner scan1 = new Scanner(System.in);
        int nome=0;
        System.out.println("Destinos disponíveis no momento");
        System.out.println(destinos[0] = "1 - São Paulo");
        System.out.println(destinos[1] = "2 - Fortaleza");
        System.out.println(destinos[2] = "3 - Curitiba");
        System.out.println(destinos[3] = "4 - Gramado");
        System.out.println(destinos[4] = "5 - Salvador");
        System.out.println(destinos[5] = "6 - Bahia\n\n");

        nome = scan1.nextInt();
        switch(nome){
            case 1:
                System.out.println("\nDestino: São Paulo foi selecionado");
                System.out.println("Custo: R$450\n");
                formaPagamentoSaoPaulo();
                break;
            case 2:
                System.out.println("\nDestino: Fortaleza foi selecionado");
                System.out.println("Custo: R$450");
                formaPagamentoFort();
                break;
            case 3:
                System.out.println("\nDestino: Curitiba foi selecionado");
                System.out.println("Custo: R$560");
                formaPagamentoCTB();
                break;
            case 4:
                System.out.println("\nDestino: Gramado foi selecionado");
                System.out.println("Custo: R$400");
                formaPagamentoGRA();
                break;
            case 5:
                System.out.println("\nDestino: Salvador foi selecionado");
                System.out.println("Custo: R$850");
                formaPagamentoSal();
                break;
            case 6:
                System.out.println("\nDestino: Bahia foi selecionado");
                System.out.println("Custo: R$1200");
                formaPagamentoBA();
                break;
            default:
                System.out.println("\n\nOpção inválida!");
                break;
        }
        scan1.close();
        return 0;

    }

    public static void SelcHorarios() {
        Scanner sc3 = new Scanner(System.in);
        int rep = 0;
        horariosIda();
        System.out.print("Selecione o horário de acordo com a numeração: ");
        rep = sc3.nextInt();
        switch (rep) {
            case 1:
                System.out.println("Horário selecionado: 10h");
                classesE();
                break;
            case 2:
                System.out.println("Horário selecionado: 13h");
                classesE();
                break;
            case 3:
                System.out.println("Horário selecionado: 15h");
                classesE();
                break;
            case 4:
                System.out.println("Horário selecionado: 18h");
                classesE();
                break;
            case 5:
                System.out.println("Horário selecionado: 21h");
                classesE();
                break;
            case 6:
                System.out.println("Horário selecionado: 23h");
                classesE();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void SelcHorarios1() {
        Scanner sc4 = new Scanner(System.in);
        int rep1 = 0;
        horariosIdaV();
        System.out.print("Selecione os horários de acordo com a numeração: ");
        rep1 = sc4.nextInt();
        switch (rep1) {
            case 1:
                System.out.println("Horário selecionado: 09h30 - 23h");
                classesE();
                break;
            case 2:
                System.out.println("Horário selecionado: 12h - 16h");
                classesE();
                break;
            case 3:
                System.out.println("Horário selecionado: 13h - 21h");
                classesE();
                break;
            case 4:
                System.out.println("Horário selecionado: 18h - 22h");
                classesE();
                break;
            case 5:
                System.out.println("Horário selecionado: 20h - 08h");
                classesE();
                break;
            case 6:
                System.out.println("Horário selecionado: 22h - 15h");
                classesE();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc4.close();
    }


    public static void SelcIdaVolta() {
        Scanner sc2 = new Scanner(System.in);
        int direc =0;
        int idav =0;
        int ida =0;

        System.out.println("\n\nSelecione se vai ser só ida ou ida e volta:");
        System.out.println("1- Somente ida");
        System.out.println("2- Ida e volta");
        direc = sc2.nextInt();
        switch (direc) {
            case 1:
                DataIda1();
                System.out.print("Selecione uma data de acordo com a numeração: ");
                ida = sc2.nextInt();
                switch (ida) {
                    case 1:
                        System.out.println("Data selecionada: 20/07");
                        SelcHorarios();
                        break;
                    case 2:
                        System.out.println("Data selecionada: 24/07");
                        SelcHorarios();
                        break;
                    case 3:
                        System.out.println("Data selecionada: 02/08");
                        SelcHorarios();
                        break;
                    case 4:
                        System.out.println("Data selecionada: 15/08");
                        SelcHorarios();
                        break;
                    case 5:
                        System.out.println("Data selecionada: 10/09");
                        SelcHorarios();
                        break;
                    case 6:
                        System.out.println("Data selecionada: 20/09");
                        SelcHorarios();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                break;
            case 2:
                DataIdaVolta();
                System.out.print("Selecione uma data de acordo com a numeração: ");
                idav = sc2.nextInt();
                switch (idav) {
                    case 1:
                        System.out.println("Data selecionada: 18/07 - 22/07");
                        SelcHorarios1();
                        break;
                    case 2:
                        System.out.println("Data selecionada: 23/07 - 28/07");
                        SelcHorarios1();
                        break;
                    case 3:
                        System.out.println("Data selecionada: 01/08 - 05/08");
                        SelcHorarios1();
                        break;
                    case 4:
                        System.out.println("Data selecionada: 11/08 - 20/08");
                        SelcHorarios1();
                        break;
                    case 5:
                        System.out.println("Data selecionada: 14/09 - 18/09");
                        SelcHorarios1();
                        break;
                    case 6:
                        System.out.println("Data selecionada: 25/09 - 28/09");
                        SelcHorarios1();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                break;
        }
        sc2.close();
    }

    public static void classesE() {
        Scanner sc5 = new Scanner(System.in);
        int css= 0;
        System.out.println("\nClasses disponíveis: ");
        System.out.println("\n1- Econômica");
        System.out.println("2- Executiva");
        System.out.print("\nSelecione se deseja ir na classe economica ou executiva: ");
        css = sc5.nextInt();
        switch (css) {
            case 1:
                System.out.println("Classe selecionada: economica");
                Assentos();
                break;
            case 2:
                System.out.println("Classe selecionada: executiva");
                Assentos();
                break;
            default:
                System.out.println("Opção inválida!");
                Assentos();
                break;
        }
        sc5.close();
    }

    public static void Assentos() {
        Scanner sc6 = new Scanner(System.in);
        int repp= 0;
        System.out.println("\nAssentos disponíveis: ");
        System.out.println("\n1- [1]");
        System.out.println("2- [2]");
        System.out.println("3- [3]");
        System.out.println("4- [4]");
        System.out.println("5- [5]");
        System.out.println("6- [6]");
        System.out.print("\nSelecione a poltrona que deseja ir: ");
        repp = sc6.nextInt();
        switch (repp) {
            case 1:
                System.out.println("Assento selecionada: [1]");
                confirmar();
                break;
            case 2:
                System.out.println("Assento selecionada: [2]");
                confirmar();
                break;
            case 3:
                System.out.println("Assento selecionada: [3]");
                confirmar();
                break;
            case 4:
                System.out.println("Assento selecionada: [4]");
                confirmar();
                break;
            case 5:
                System.out.println("Assento selecionada: [5]");
                confirmar();
                break;
            case 6:
                System.out.println("Assento selecionada: [6]");
                confirmar();
                break;
        }
    }


    public static void confirmar() {
        Scanner sc = new Scanner(System.in);
        int conf =0;
        System.out.println("\nDiante de todas as opções escolhidas confirme se deseja realmente embarcar? ");
        System.out.println("\n1- Sim");
        System.out.println("2- Não");
        System.out.print("Confirmação: ");
        conf = sc.nextInt();
        switch(conf){
            case 1:
                System.out.println("\n\nAgradecemos a preferência!\n\n");
                break;
            case 2:
                System.out.println("Até a próxima!");
                break;

        }
        sc.close();
    }


    public static void formaPagamentoSaoPaulo(){

        Scanner scan20 = new Scanner(System.in);
        double valueSP = 450;
        double parcelas = 0;
        double resultado = 0;
        int i = 0;

        System.out.println("\nSelecione a forma de pagamento");
        System.out.println("1 - Parcelado");
        System.out.println("2 - A vista");
        System.out.print("Opção desejada: ");
        i = scan20.nextInt();
        switch(i){
            case 1:
                System.out.println("\n\nParcelado selecionado");
                System.out.println("Em quanto deseja parcelar?");
                System.out.print("Parcelas: ");
                parcelas = scan20.nextDouble();
                resultado = valueSP / parcelas;
                System.out.println("\n\n-Total a pagar em cada parcela: " + resultado + " \nParcelas selecionadas: " + parcelas);
                SelcIdaVolta();
                break;

            case 2:
                System.out.println("\nA vista selecionado");
                System.out.println("Total: " + valueSP);
                SelcIdaVolta();
                break;
        }
        scan20.close();

    }


    public static void formaPagamentoFort(){

        Scanner scan20 = new Scanner(System.in);
        double valueSP = 450;
        double parcelas = 0;
        double resultado = 0;
        int i = 0;

        System.out.println("\nSelecione a forma de pagamento");
        System.out.println("1 - Parcelado");
        System.out.println("2 - A vista");
        System.out.print("Opção desejada: ");
        i = scan20.nextInt();
        switch(i){
            case 1:
                System.out.println("\n\nParcelado selecionado");
                System.out.println("Em quanto deseja parcelar?");
                System.out.print("Parcelas: ");
                parcelas = scan20.nextDouble();
                resultado = valueSP / parcelas;
                System.out.println("\n\n-Total a pagar em cada parcela: " + resultado + " \nParcelas selecionadas: " + parcelas);
                SelcIdaVolta();
                break;

            case 2:
                System.out.println("\nA vista selecionado");
                System.out.println("Total: " + valueSP);
                SelcIdaVolta();
                break;
        }
        scan20.close();

    }

    public static void formaPagamentoCTB(){

        Scanner scan20 = new Scanner(System.in);
        double valueSP = 560;
        double parcelas = 0;
        double resultado = 0;
        int i = 0;

        System.out.println("\nSelecione a forma de pagamento");
        System.out.println("1 - Parcelado");
        System.out.println("2 - A vista");
        System.out.print("Opção desejada: ");
        i = scan20.nextInt();
        switch(i){
            case 1:
                System.out.println("\n\nParcelado selecionado");
                System.out.println("Em quanto deseja parcelar?");
                System.out.print("Parcelas: ");
                parcelas = scan20.nextDouble();
                resultado = valueSP / parcelas;
                System.out.println("\n\n-Total a pagar em cada parcela: " + resultado + " \nParcelas selecionadas: " + parcelas);
                SelcIdaVolta();
                break;

            case 2:
                System.out.println("\nA vista selecionado");
                System.out.println("Total: " + valueSP);
                SelcIdaVolta();
                break;
        }
        scan20.close();

    }

    public static void formaPagamentoGRA(){

        Scanner scan20 = new Scanner(System.in);
        double valueSP = 400;
        double parcelas = 0;
        double resultado = 0;
        int i = 0;

        System.out.println("\nSelecione a forma de pagamento");
        System.out.println("1 - Parcelado");
        System.out.println("2 - A vista");
        System.out.print("Opção desejada: ");
        i = scan20.nextInt();
        switch(i){
            case 1:
                System.out.println("\n\nParcelado selecionado");
                System.out.println("Em quanto deseja parcelar?");
                System.out.print("Parcelas: ");
                parcelas = scan20.nextDouble();
                resultado = valueSP / parcelas;
                System.out.println("\n\n-Total a pagar em cada parcela: " + resultado + " \nParcelas selecionadas: " + parcelas);
                SelcIdaVolta();
                break;

            case 2:
                System.out.println("\nA vista selecionado");
                System.out.println("Total: " + valueSP);
                SelcIdaVolta();
                break;
        }
        scan20.close();

    }

    public static void formaPagamentoSal(){
        Scanner scan20 = new Scanner(System.in);
        double valueSP = 850;
        double parcelas = 0;
        double resultado = 0;
        int i = 0;

        System.out.println("\nSelecione a forma de pagamento");
        System.out.println("1 - Parcelado");
        System.out.println("2 - A vista");
        System.out.print("Opção desejada: ");
        i = scan20.nextInt();
        switch(i){
            case 1:
                System.out.println("\n\nParcelado selecionado");
                System.out.println("Em quanto deseja parcelar?");
                System.out.print("Parcelas: ");
                parcelas = scan20.nextDouble();
                resultado = valueSP / parcelas;
                System.out.println("\n\n-Total a pagar em cada parcela: " + resultado + " \nParcelas selecionadas: " + parcelas);
                SelcIdaVolta();
                break;

            case 2:
                System.out.println("\nA vista selecionado");
                System.out.println("Total: " + valueSP);
                SelcIdaVolta();
                break;
        }
        scan20.close();

    }

    public static void formaPagamentoBA(){

        Scanner scan20 = new Scanner(System.in);
        double valueSP = 1200;
        double parcelas = 0;
        double resultado = 0;
        int i = 0;

        System.out.println("\nSelecione a forma de pagamento");
        System.out.println("1 - Parcelado");
        System.out.println("2 - A vista");
        System.out.print("Opção desejada: ");
        i = scan20.nextInt();
        switch(i){
            case 1:
                System.out.println("\n\nParcelado selecionado");
                System.out.println("Em quanto deseja parcelar?");
                System.out.print("Parcelas: ");
                parcelas = scan20.nextDouble();
                resultado = valueSP / parcelas;
                System.out.println("\n\n-Total a pagar em cada parcela: " + resultado + " \nParcelas selecionadas: " + parcelas);
                SelcIdaVolta();
                break;

            case 2:
                System.out.println("\nA vista selecionado");
                System.out.println("Total: " + valueSP);
                SelcIdaVolta();
                break;
        }
        scan20.close();

    }



}
