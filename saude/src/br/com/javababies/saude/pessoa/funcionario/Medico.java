package br.com.javababies.saude.pessoa.funcionario;

import br.com.javababies.saude.pessoa.paciente.*;;
/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Medico extends Funcionario {
    public int crm;
    public String receita;
    public String diagnostico;

    public Medico(String nome,  String cpf, String rg, String telefone, int crm){
    	super(nome, cpf, rg, telefone);
    	
    	/*System.out.println("Seu nome: "+nome);
    	System.out.println("CRM: "+crm);*/
    }
    
    public String escreverReceita(String nomePaci, String nomeMed, int numAten){
    	if(numAten%2 == 0){
    		diagnostico = "Câncer";
    	}else{
    		diagnostico = "Aids";
    	}
    	
    	return receita = "Paciente: "+nomePaci+"\n"+
    			         "Medico  : "+nomeMed+"\n"+
    			         "Num. Atend: "+numAten+"\n"+
    			         "Diagnostico: "+diagnostico;
    }
}
