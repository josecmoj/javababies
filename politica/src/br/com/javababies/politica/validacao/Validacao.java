package br.com.javababies.politica.validacao;

import java.util.Random;

public class Validacao {
	public boolean isNumeric(String str){
   	 try  
   	  {  
   	    int d = Integer.parseInt(str);  
   	  }  
   	  catch(NumberFormatException nfe)  
   	  {  
   	    return false;  
   	  }  
   	  return true;  
   }
	public int aleatorio(int qtdCaracteres){
		Random rnd = new Random();
		int aleatorio = rnd.nextInt(qtdCaracteres)+1;
		return aleatorio;
	}
}
