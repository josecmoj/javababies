package main.java.comunicacao.pessoa;

public class Funcionario extends  Pessoa {
        protected String cargo;
        protected int salario;

        public String getCargo() {
                return this.cargo;
        }
        public void setCargo(String cargo) {
                this.cargo = cargo;
        }
        public int getSalario() {
                return this.salario;
        }
        public void setSalario(int salario) {
                this.salario = salario;
        }

}