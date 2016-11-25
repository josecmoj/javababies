package br.com.javababies.politica.pessoa;

import java.util.Random;

public class TituloEleitor {
	private int numero;
	private int zona;
	private int secao;
	
	public TituloEleitor(){
		Math.random();
		this.numero = numeroTit();
		this.zona = numeroZona();
		this.secao = numeroSecao();
		//System.out.println("Criado com sucesso:\nNúmero: "+this.numero+"\nZona: "+this.zona+"\nSeção: "+this.secao);
	}
	private int numeroTit(){
		return aleatorio();
	}
	private int numeroZona() {
		int zona = aleatorio()/10000000;
		return zona;
	}
	private int numeroSecao() {
		int secao = aleatorio()/10000000;
		return secao;
	}
	private int aleatorio(){
		Random rnd = new Random();
		int aleatorio = rnd.nextInt();
		if(aleatorio < 0)
			aleatorio = aleatorio * (-1);
		return aleatorio;
	}
	public void exibirTitulo(){
		System.out.println("Dados do título de eleitor:\nNúmero: "+this.numero+"\nZona: "+this.zona+"\nSeção: "+this.secao);
	}
}
