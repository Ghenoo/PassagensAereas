package br.passagensaereas.fag;

public class Piloto extends Funcionario{

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario + 2000);
    }
}