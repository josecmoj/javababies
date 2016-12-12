package br.com.javababies.alimentacao.pessoa;

public class Validacao {

	

	public boolean ehNumero(String numeroTexto){
		try{
			int numero = Integer.parseInt(numeroTexto);
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
}
