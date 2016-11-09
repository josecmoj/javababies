package main.java.politica;

/**
 * Created by jloliveira1 on 08/11/2016.
 */
public class Presidente extends Candidato {

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
