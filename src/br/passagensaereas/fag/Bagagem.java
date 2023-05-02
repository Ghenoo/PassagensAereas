package br.passagensaereas.fag;


public class Bagagem {
    private double peso;
    private double valor;
    private final double taxaquilo = 20.0;

    public Bagagem(double peso) {
        this.peso = peso;
        this.valor = calcularValor();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.valor = calcularValor();
    }

    public double getValor() {
        return valor;
    }

    private double calcularValor() {
        return peso * taxaquilo;
    }
}

