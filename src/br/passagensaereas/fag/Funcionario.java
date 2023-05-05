package br.passagensaereas.fag;

    public class Funcionario extends Pessoa {
        private int codigo;
        private String nome;
        private int companhia;
        private String cargo;
        private String contaCorrente;


        public Funcionario(int codigo, String nome, int companhia, String cargo, String contaCorrente) {
            this.codigo = codigo;
            this.nome = nome;
            this.companhia = companhia;
            this.cargo = cargo;
            this.contaCorrente = contaCorrente;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCodigo() {
            return codigo;
        }
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
        public String getContaCorrente() {
            return contaCorrente;
        }
        public void setContaCorrente(String contaCorrente) {
            this.contaCorrente = contaCorrente;
        }

        static CompanhiaAerea[] companhias = CompanhiaAerea.getCompanhias();
        static Cargo[] cargos = Cargo.getCargos();

        public static Funcionario[] getFuncionarios(CompanhiaAerea[] companhia, Cargo[] cargo) {
            Funcionario[] funcionarios = {
                    new Funcionario(11, "Adolfo", companhias[0].getCodigo(), cargos[0].getNome(), "744-9"),
                    new Funcionario(22, "Felipe", companhias[1].getCodigo(), cargos[1].getNome(), "800-0"),
                    new Funcionario(33, "Maria Luisa", companhias[2].getCodigo(), cargos[2].getNome(), "115-3"),
                    new Funcionario(44, "Ester", companhias[3].getCodigo(), cargos[3].getNome(), "211-5"),
            };
            return funcionarios;
        }

        public int getCompanhia() {
            return companhia;
        }

        public void setCompanhia(int companhia) {
            this.companhia = companhia;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public static CompanhiaAerea[] getCompanhias() {
            return companhias;
        }

        public static void setCompanhias(CompanhiaAerea[] companhias) {
            Funcionario.companhias = companhias;
        }

        public static Cargo[] getCargos() {
            return cargos;
        }

        public static void setCargos(Cargo[] cargos) {
            Funcionario.cargos = cargos;
        }




}
