package br.passagensaereas.fag;

public class CompanhiaAerea {
    private int codigo;
    private String descricao;

    public CompanhiaAerea(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }



    public int getCodigo() {
        return codigo;
    }



    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public static CompanhiaAerea[] getCompanhias(){
        CompanhiaAerea[] companhias = {

                new CompanhiaAerea(1, "Companhia azul"),
                new CompanhiaAerea(2, "Companhia amarela"),
                new CompanhiaAerea(3, "Companhia roxa"),
                new CompanhiaAerea(4, "Companhia vermelho")

        };
        return companhias;
    }
}