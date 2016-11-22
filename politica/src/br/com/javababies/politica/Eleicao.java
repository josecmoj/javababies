package br.com.javababies.politica;

import eleitor.pessoa.EleitorCandidato;

/**
 * Created by jloliveira1 on 01/11/2016.
 */
public class Eleicao
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Vereador verea = new Vereador();
    private Prefeito pref = new Prefeito();
    private Governador gov = new Governador();
    private EleitorCandidato elei = new EleitorCandidato();


    public void votar()
    {
        elei.gravarVoto(true);
    }
}