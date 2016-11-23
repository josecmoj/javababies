package main.java.comunicacao.pessoa;

public class Funcionario extends  Pessoa {
        private String cargo;
        private int salario;

        public String getCargo() {
                return this.cargo;
        }
        private void setCargo(String cargo) {
                this.cargo = cargo;
        }
        public int getSalario() {
                return this.salario;
        }
        private void setSalario(int salario) {
                this.salario = salario;
        }

    public Funcionario(String nome, String tipoPessoa,int CGCCPF,String cargo, int salario){
    	super(nome, tipoPessoa, CGCCPF);
    	setCargo(cargo);
    	setSalario(salario);
        }
   
    public void exibeDados(){
    	System.out.println("CGCCPF : " + this.getCgccpf());
    	System.out.println("NOME   : " + this.getNome());
    	System.out.println("TIPO   : " + this.getTipoPessoa());
    	System.out.println("CARGO  : " + this.getCargo());
    	System.out.println("SALARIO: " + this.getSalario());
    	System.out.println("\n");
    	}
}