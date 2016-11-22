package eleitor.pessoa;

import br.com.javababies.politica.Candidato;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public class EleitorCandidato extends Pessoa implements Candidato{
    private TituloEleitor titulo;
    private int zona;
    private int secao;
    private boolean votou;
    
    public EleitorCandidato(){
    	this.titulo = new TituloEleitor();
    }

    public void gravaTitulo(int numTitulo){
     //   this.tituloEleitor = numTitulo;
    }
    public int retornaTitulo(){
       // return this.tituloEleitor;
    	return 0;
    }
    public void gravarVoto(boolean voto){
        if(voto)
        {
            this.votou = true;
        }
    }
    public void gravarCandidato(String numCandidato){
    	
    }
}
