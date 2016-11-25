package br.com.javababies.politica.validacao;

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
}
