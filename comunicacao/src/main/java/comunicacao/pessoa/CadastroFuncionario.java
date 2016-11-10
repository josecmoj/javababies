package main.java.comunicacao.pessoa;

public class CadastroFuncionario {
    public static void main(String[] args) {
    Funcionario wrkfuncionario = new Funcionario();
        wrkfuncionario.setNome("Nome1");
        wrkfuncionario.setCgccpf(1234);
        wrkfuncionario.setTipopessoa("PF");
        wrkfuncionario.setCargo("Consultor");
        wrkfuncionario.setSalario(897);
        System.out.println("CGCCPF : " + wrkfuncionario.getCgccpf());
        System.out.println("NOME   : " + wrkfuncionario.getNome());
        System.out.println("TIPO   : " + wrkfuncionario.getTipopessoa());
        System.out.println("CARGO  : " + wrkfuncionario.getCargo());
        System.out.println("SALARIO: " + wrkfuncionario.getSalario());
    }

}
