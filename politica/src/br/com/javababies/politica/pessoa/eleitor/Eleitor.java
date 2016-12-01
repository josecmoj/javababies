package br.com.javababies.politica.pessoa.eleitor;

import br.com.javababies.politica.cargo.CandidatoInterface;
import br.com.javababies.politica.cargo.CargoCandidatoEnum;
import br.com.javababies.politica.pessoa.Pessoa;
import br.com.javababies.politica.pessoa.TituloEleitor;
import br.com.javababies.politica.validacao.Validacao;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public class Eleitor extends Pessoa{
    private TituloEleitor titulo;
    private boolean votou;
    //private int numeroCandidato;
    //private CargoCandidatoEnum cargoCandidato;
    //private int zona;
    //private int secao;
    
    public Eleitor(String nome, int RG, int CPF){
    	super(nome, RG, CPF);
    	this.titulo = new TituloEleitor();
    }
    
    
	/*private boolean isGovernador(CargoCandidatoEnum cargoCandidatoEnum) {
    	if(cargoCandidatoEnum.equals(CargoCandidatoEnum.GOVERNADOR)){
    		return true;
    	}else return false;
    }*/
    
	public void retornaTitulo(){
       titulo.exibirTitulo();
    }
    public void gravarVoto(boolean voto){
        if(voto)
        {
            this.votou = true;
        }
    }
    public void gravarCandidato(String numCandidato){
    	
    }
	public void exibeDados() {
		System.out.println("EXIBIR DADOS############");
		System.out.println("Nome: "+this.retornaNome());
		System.out.println("CPF: "+this.retornaCPF());
		System.out.println("RG: "+this.retornaRG());
		this.retornaTitulo();
		System.out.println("FIM DADOS############\n");
	}

}
