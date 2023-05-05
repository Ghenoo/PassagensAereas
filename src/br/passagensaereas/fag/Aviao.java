package br.passagensaereas.fag;

public class Aviao {
        private int codigo;
        private String carga;
        private int companhia;
        private int quantidadeEconomica;
        private int quantidadeExecutiva;
        private int quantidadePrimeira;


        public Aviao(int codigo, String carga, int companhia, int quantidadeEconomica, int quantidadeExecutiva, int quantidadePrimeira) {
            this.codigo = codigo;
            this.carga = carga;
            this.companhia = companhia;
            this.quantidadeEconomica = quantidadeEconomica;
            this.quantidadeExecutiva = quantidadeExecutiva;
            this.quantidadePrimeira = quantidadePrimeira;
        }



        public int getCodigo() {
            return codigo;
        }
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        public String getCarga() {
            return carga;
        }
        public void setCarga(String carga) {
            this.carga = carga;
        }
        public int getQuantidadeEconomica() {
            return quantidadeEconomica;
        }
        public void setQuantidadeEconomica(int quantidadeEconomica) {
            this.quantidadeEconomica = quantidadeEconomica;
        }
        public int getQuantidadeExecutiva() {
            return quantidadeExecutiva;
        }
        public void setQuantidadeExecutiva(int quantidadeExecutiva) {
            this.quantidadeExecutiva = quantidadeExecutiva;
        }
        public int getQuantidadePrimeira() {
            return quantidadePrimeira;
        }
        public void setQuantidadePrimeira(int quantidadePrimeira) {
            this.quantidadePrimeira = quantidadePrimeira;
        }

        static CompanhiaAerea[] companhias = CompanhiaAerea.getCompanhias();

        public static Aviao[] getAvioes(CompanhiaAerea[] companhia) {
            Aviao[] avioes = {
                    new Aviao(1, "leve", companhias[0].getCodigo(), 80, 0, 0 ),
                    new Aviao(1, "medio-leve", companhias[0].getCodigo(), 80, 30, 0 ),
                    new Aviao(1, "medio", companhias[0].getCodigo(), 150, 50, 0 ),
                    new Aviao(1, "pesado", companhias[0].getCodigo(), 200, 50, 30 ),
                    new Aviao(1, "leve", companhias[1].getCodigo(), 60, 20, 0 ),
                    new Aviao(1, "medio", companhias[1].getCodigo(), 90, 50, 0 ),
                    new Aviao(1, "pesado", companhias[1].getCodigo(), 300, 50, 50 ),
                    new Aviao(1, "leve", companhias[2].getCodigo(), 100, 30, 0 ),
                    new Aviao(1, "pesado", companhias[2].getCodigo(), 250, 50, 50 ),
                    new Aviao(1, "medio", companhias[3].getCodigo(), 150, 0, 0 ),
            };
            return avioes;
        }

}
