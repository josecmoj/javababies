package main.java.politica;

import main.java.politica.eleitor.Eleitor;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public abstract class Candidato extends Eleitor
{
    protected int NumeroCandidato;
    Partido part1 = new Partido();

    public abstract void gravarCandidato(String numCandidato);

    public int retornaCandidato(){
        return this.NumeroCandidato;
    }
}
