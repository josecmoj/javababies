package br.com.javababies.saude.pessoa.funcionario;

import br.com.javababies.saude.pessoa.Pessoa;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Funcionario extends Pessoa {

    int id;
    double salario;
    public String atividade;

    public int geraId(){
        return this.id;
    }

    public double atribuirSalario(){
        return this.salario;
    }

    public String atribuirAtividade(){
        return this.atividade;
    }

    public Funcionario(String nome, String cpf, String rg, String telefone) {
    	super(nome, cpf, rg, telefone);
    }
}
