package br.passagensaereas.fag;

public class Endereco extends Pessoa {
    private String rua, bairro, cidade, estado, pais;;

    public String getRua() {
        return rua;
    }

    public void setNome(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setEmail(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
