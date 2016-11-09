package main.java.politica;

/**
 * Created by jloliveira1 on 01/11/2016.
 */
public class Governador extends Candidato
{

    public void gravarCandidato(String numCandidato){
        if(numCandidato.length() == 2)
        {
            super.NumeroCandidato = Integer.parseInt(numCandidato);
        }
    }
}