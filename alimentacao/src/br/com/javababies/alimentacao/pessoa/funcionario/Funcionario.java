package br.com.javababies.alimentacao.pessoa.funcionario;

import br.com.javababies.alimentacao.pessoa.Pessoa;

/**
 * Created by mtraykavo on 03/11/2016.
 */
public abstract class Funcionario extends Pessoa {
    int Identificacao;
    double Salario;
    public Funcionario(String id, String nome, String doc,double salario, int ident){
    	super(id,nome,doc);
    	this.Salario = salario;
    	this.Identificacao = ident;
    }

    public void RecebeSalario(){
    }

    public void RecebePlr() {
    }
    
}
