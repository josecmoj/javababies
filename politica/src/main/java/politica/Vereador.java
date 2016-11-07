package br.com.javababies.politica;

/**
 * Created by jloliveira1 on 01/11/2016.
 */
public class Vereador extends Candidato
{

    public Vereador()
    {
    }

    public void gravarCandidato(String numCandidato){
        if(numCandidato.length() == 5)
        {
            super.NumeroCandidato = Integer.parseInt(numCandidato);
        }
    }
}