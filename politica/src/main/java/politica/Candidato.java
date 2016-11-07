package br.com.javababies.politica;

import br.com.javababies.politica.eleitor.Eleitor;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public abstract class Candidato extends Eleitor
{
    protected int NumeroCandidato;
    Partido part1 = new Partido();
    public Candidato()
    {
    }

    public abstract void gravarCandidato(String numCandidato);

    public int retornaCandidato(){
        return this.NumeroCandidato;
    }
}
