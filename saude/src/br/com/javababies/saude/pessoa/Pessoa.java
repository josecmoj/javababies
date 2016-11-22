package br.com.javababies.saude.pessoa;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public abstract class Pessoa {

    public String nome;
    public String cpf;
    public String rg;
    public String telefone;

    public Pessoa(String nome, String cpf, String rg, String telefone){
    	this.nome = nome;
    	this.cpf  = cpf;
    	this.rg   = rg; 
    	this.telefone = telefone;
    }
}
