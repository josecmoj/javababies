package br.com.javababies.saude.pessoa.funcionario;

import java.util.Random;

public class Atendente extends Funcionario{
	
	public int numAtend;
	
	public Atendente(String nome, String cpf, String rg, String telefone){
		super(nome, cpf, rg, telefone);
	}
	
	public int GeraNumeroAtendimento(){
		Random numRandom = new Random();
		numAtend = numRandom.nextInt(150);
		return numAtend;
	}

}
