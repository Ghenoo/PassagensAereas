package br.passagensaereas.fag;

public class Pessoa {
    private int cpf;
    private String nome, email, telefone;

    public Pessoa(String nome, String email, String telefone, String rua, String bairro, String estado, String pais) {

    }

    public Pessoa() {
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
