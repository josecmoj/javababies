package main.java.comunicacao.pessoa;

public class CadastroFuncionario {
    public static void main(String[] args) {
    Funcionario wrkfuncionario = new Funcionario("Nome1", "PF", 1234, "Consultor", 897);
    Funcionario wrkfuncionario1 = new Funcionario("Nome2", "PF", 00001, "Vendedor", 123);
        /*wrkfuncionario.setNome("Nome1");
        wrkfuncionario.setCgccpf(1234);
        wrkfuncionario.setTipopessoa("PF");
        wrkfuncionario.setCargo("Consultor");
        wrkfuncionario.setSalario(897); */
        wrkfuncionario.exibeDados();
        wrkfuncionario1.exibeDados();
        
    }

}
