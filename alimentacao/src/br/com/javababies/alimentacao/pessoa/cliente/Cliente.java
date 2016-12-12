package br.com.javababies.alimentacao.pessoa.cliente;

import br.com.javababies.alimentacao.pessoa.Pessoa;

/**
 * Created by mtraykavo on 03/11/2016.
 */
public class Cliente extends Pessoa {

	int numero;
	
	public Cliente(String id, String nome, String doc, int num) {
		super(id, nome, doc);
		this.numero = num;
	}
    public void Pagar(){
    }
    public void Identificacao(){
    }

   
}
