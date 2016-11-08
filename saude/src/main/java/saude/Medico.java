package br.com.stefanini.saude;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Medico extends Funcionario {
    int crm;
    String diagnostico;
    //Receita receita;

    public Medico()
    {
        //receita = new Receita();
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
