package br.passagensaereas.fag;

    public class Passageiro extends Pessoa {
        public Passageiro(int codigo, String nome, String email, String telefone, String rua, String pais, String estado, String cidade, String CEP){
        }
        private int codigo;
        private String passaporte;
        public int getCodigo() {
            return codigo;
        }
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        public String getPassaporte() {
            return passaporte;
        }
        public void setPassaporte(String passaporte) {
            this.passaporte = passaporte;
        }
}
