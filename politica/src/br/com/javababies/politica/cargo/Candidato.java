package br.com.javababies.politica.cargo;

import br.com.javababies.politica.pessoa.Pessoa;
import br.com.javababies.politica.pessoa.TituloEleitor;
import br.com.javababies.politica.validacao.Validacao;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public class Candidato extends Pessoa implements CandidatoInterface{
   
	private int numeroCandidato;
    private CargoCandidatoEnum cargoCandidato;
    
    public Candidato(String nome, int RG, int CPF,CargoCandidatoEnum cargoCandidatoEnum, String numeroCandidatoStr) {
		super(nome, RG, CPF);
		
    	Validacao val = new Validacao();
    	
    	//this.numeroCandidato = validaNumeroCandidato(cargoCandidatoEnum);
		if(val.isNumeric(numeroCandidatoStr)){
			if(numeroCandidatoStr.length() == cargoCandidatoEnum.numero()){
				this.numeroCandidato = Integer.parseInt(numeroCandidatoStr);
				this.cargoCandidato = cargoCandidatoEnum;
			}
			else{
				System.out.println("Número de candidato não respeita o tamanho, tamanho correto: "+cargoCandidatoEnum.numero());
			}
		}
		else{
			System.out.println("Valor não numérico para candidato");
		}
    	switch (cargoCandidatoEnum) {
		case DEPUTADOESTADUAL:
			//TODO: colocar o tratamento específico
			break;
		case DEPUTADOFEDERAL:
			//TODO: colocar o tratamento específico
			break;
		case GOVERNADOR:
			//TODO: colocar o tratamento específico
			break;
		case PREFEITO:
			//TODO: colocar o tratamento específico
			break;
		case PRESIDENTE:
			//TODO: colocar o tratamento específico
			break;
		case VEREADOR:
			//TODO: colocar o tratamento específico
			break;
		default:
			break;
		}
    	
    }
    private boolean isNumeric(String str){
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
    
	/*private boolean isGovernador(CargoCandidatoEnum cargoCandidatoEnum) {
    	if(cargoCandidatoEnum.equals(CargoCandidatoEnum.GOVERNADOR)){
    		return true;
    	}else return false;
    }*/
    	    
    public void gravarCandidato(String numCandidato){
    	
    }
	public void exibeDados() {
		System.out.println("EXIBIR DADOS############");
		retornaCandidato();	
		System.out.println("Nome: "+this.retornaNome());
		System.out.println("CPF: "+this.retornaCPF());
		System.out.println("RG: "+this.retornaRG());
		System.out.println("FIM DADOS############\n");
	}
	private void retornaCandidato() {
		if(this.cargoCandidato != null){
			System.out.println("Cargo Candidato: "+this.cargoCandidato);
			System.out.println("Número Candidato: "+this.numeroCandidato);
		}
	}
}
