package br.passagensaereas.fag;

public class Passageiro extends Pessoa {

    private String passaporte, codigo;

    public Passageiro(String nome, int idade, String endereco) {
        super(nome, idade, endereco);
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
