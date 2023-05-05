package br.passagensaereas.fag;


    public class Cargo {
        private int codigo;
        private String nome;
        private String descricao;


        public Cargo(int codigo, String nome, String descricao) {
            this.codigo = codigo;
            this.nome = nome;
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



        public static Cargo[] getCargos(){
            Cargo[] cargos = {
                    new Cargo(0, "Atendente", "Funcionário responsavel pelo atendimento"),
                    new Cargo(0, "Atendente-premium", "Funcionário responsavel pelo atendimento"),
                    new Cargo(0, "Secretário", "Funcionário responsavel pelo atendimento"),
                    new Cargo(0, "Gerente", "Funcionário responsavel pelo atendimento"),
            };
            return cargos;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    }
