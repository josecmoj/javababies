package br.com.javababies.saude.pessoa.funcionario;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Medico extends Funcionario {
    int crm;
    String diagnostico;
    //Receita receita;

    public Medico(String nome, String cpf, String rg, String telefone) {
    	super(nome, cpf, rg, telefone);
    }

    public double AtribuirSalario(double salario, int bonus){
        return salario + bonus;
    }

    public String AtribuirAtividade(String atividade){
        return atividade;
    }

    public int GeraCrm(){
        return this.crm;
    }

    public String GeraDiagnostico(){
        return this.diagnostico;
    }

}
