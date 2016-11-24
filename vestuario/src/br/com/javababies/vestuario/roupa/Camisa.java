package br.com.javababies.vestuario.roupa;

import br.com.javababies.vestuario.Vestuario;

/**
 * Created by bcbertelli on 09/11/2016.
 */
public class Camisa extends Vestuario {
	
	public Camisa(String genero, String cor, String tamanho, String marca, double valor){
		super(genero, cor, tamanho, marca, valor);
		System.out.println("Camisa criada com sucesso");
		
	}
	
}
