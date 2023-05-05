package br.passagensaereas.fag;


public class Bagagem {
    private Double peso;
    public void setPeso(double peso) {
        double taxaPorKg = 2.50;

        Bagagem bagagem = new Bagagem();

        bagagem.setPeso(peso);

        double preco = peso * taxaPorKg;
    }
}