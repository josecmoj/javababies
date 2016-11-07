package br.com.javababies.politica;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public class Prefeito extends Candidato
{

    public Prefeito()
    {
    }


    public void gravarCandidato(String numCandidato){
        System.out.println(numCandidato.length());
        if(numCandidato.length() <3)
        {

            super.NumeroCandidato = Integer.parseInt(numCandidato);
        }
        else{
            super.NumeroCandidato = 0;
        }
    }
}
