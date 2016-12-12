package br.com.javababies.alimentacao.pessoa;

import javax.swing.JOptionPane;

/**
 //* Created by mtraykavo on 03/11/2016.
 //*/
public abstract class Pessoa {
	
	
	private String id;	//identificacao
	private String nome;	//nome da pessoa
	private String documento;//documento da pessoa       
	private double Altura;
	private double Peso;   
    
    public Pessoa(String id, String nome, String doc) {
        this.id = id;
        this.nome = nome;
        this.documento = doc;
    }

	public String getId() {
		return this.id;
	}
	public String getNome() {
		return this.nome;
	}
	public String getDocumento() {
		return this.documento;
	}

 

}
