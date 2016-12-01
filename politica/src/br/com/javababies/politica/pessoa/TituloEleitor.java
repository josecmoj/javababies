package br.com.javababies.politica.pessoa;

import java.util.Random;

import br.com.javababies.politica.validacao.Validacao;

public class TituloEleitor {
	private int numero;
	private int zona;
	private int secao;
	private Validacao vali = new Validacao();
	
	public TituloEleitor(){
		this.numero = numeroTit();
		this.zona = numeroZona();
		this.secao = numeroSecao();
		//System.out.println("Criado com sucesso:\nNúmero: "+this.numero+"\nZona: "+this.zona+"\nSeção: "+this.secao);
	}
	private int numeroTit(){
		return vali.aleatorio(999999999);
	}
	private int numeroZona() {
		int zona = vali.aleatorio(999);
		return zona;
	}
	private int numeroSecao() {
		int secao = vali.aleatorio(999);
		return secao;
	}
	
	public void exibirTitulo(){
		System.out.println("Dados do título de eleitor:\nNúmero: "+this.numero+"\nZona: "+this.zona+"\nSeção: "+this.secao);
	}
}
