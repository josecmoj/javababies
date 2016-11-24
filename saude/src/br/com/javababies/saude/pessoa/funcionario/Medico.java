package br.com.javababies.saude.pessoa.funcionario;

import br.com.javababies.saude.Diagnostico;
import br.com.javababies.saude.TipoDoenca;
import br.com.javababies.saude.pessoa.paciente.*;
import br.com.javababies.saude.*;
/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Medico extends Funcionario {
    public int crm;
    public String receita;
    public String r;


    public Medico(String nome,  String cpf, String rg, String telefone, int crm){
    	super(nome, cpf, rg, telefone);
    	
    	/*System.out.println("Seu nome: "+nome);
    	System.out.println("CRM: "+crm);*/
    }
    
    public String escreverReceita(String nomePaci, String nomeMed, int numAten){
    	Diagnostico diagnostico = new Diagnostico();
    	
    	if(numAten <=5){
    		diagnostico.tipoDoenca = TipoDoenca.CANCER;    		
    	}else if(numAten >= 6 & numAten <= 15){
    		diagnostico.tipoDoenca = TipoDoenca.AIDS; 
    	}else if(numAten >= 16 & numAten <= 20){
    		diagnostico.tipoDoenca = TipoDoenca.GRIPE;
    	}
    	
    	return receita = "Paciente: "+nomePaci+"\n"+
    			         "Medico  : "+nomeMed+"\n"+
    			         "Num. Atend: "+numAten+"\n"+
    			         "Diagnostico: "+diagnostico.tipoDoenca;
    }
}
