package main.java.politica;

import main.java.politica.eleitor.Eleitor;

/**
 * Created by jloliveira1 on 01/11/2016.
 */
public class Eleicao
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Vereador verea = new Vereador();
    private Prefeito pref = new Prefeito();
    private Governador gov = new Governador();
    private Eleitor elei = new Eleitor();


    public void votar()
    {
        elei.gravarVoto(true);
    }
}