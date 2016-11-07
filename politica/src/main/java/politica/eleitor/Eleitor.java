package br.com.javababies.politica.eleitor;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public class Eleitor extends Pessoa{
    private int tituloEleitor;
    private int zona;
    private int secao;
    private boolean votou;

    public void gravaTitulo(int numTitulo){
        this.tituloEleitor = numTitulo;
    }
    public int retornaTitulo(){
        return this.tituloEleitor;
    }
    public void gravarVoto(boolean voto)
    {
        if(voto)
        {
            this.votou = true;
        }
    }
}
