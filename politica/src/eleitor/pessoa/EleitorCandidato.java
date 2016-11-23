package eleitor.pessoa;

import br.com.javababies.politica.Candidato;
import br.com.javababies.politica.CargoCandidatoEnum;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public class EleitorCandidato extends Pessoa implements Candidato{
    private TituloEleitor titulo;
    private int numeroCandidato;
    private CargoCandidatoEnum cargoCandidato;
    private int zona;
    private int secao;
    private boolean votou;
    
    public EleitorCandidato(String nome, int RG, int CPF){
    	super(nome, RG, CPF);
    	this.titulo = new TituloEleitor();
    	
    }
    public EleitorCandidato(String nome, int RG, int CPF,CargoCandidatoEnum cargoCandidatoEnum, String numeroCandidatoStr){
    	super(nome, RG, CPF);
    	this.titulo = new TituloEleitor();
    	//this.numeroCandidato = validaNumeroCandidato(cargoCandidatoEnum);
		if(isNumeric(numeroCandidatoStr)){
			if(numeroCandidatoStr.length() == cargoCandidatoEnum.numero()){
				this.numeroCandidato = Integer.parseInt(numeroCandidatoStr);
				this.cargoCandidato = cargoCandidatoEnum;
			}
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
    	
    	this.titulo = new TituloEleitor();
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
		retornaCandidato();	
		System.out.println("Nome: "+this.retornaNome());
		System.out.println("CPF: "+this.retornaCPF());
		System.out.println("RG: "+this.retornaRG());
		this.retornaTitulo();
		System.out.println("FIM DADOS############\n");
	}
	private void retornaCandidato() {
		if(this.cargoCandidato != null){
			System.out.println("Cargo Candidato: "+this.cargoCandidato);
			System.out.println("Número Candidato: "+this.numeroCandidato);
		}
	}
}
