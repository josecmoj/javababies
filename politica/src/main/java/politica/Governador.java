package br.com.javababies.politica;

/**
 * Created by jloliveira1 on 01/11/2016.
 */
public class Governador extends Candidato
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * COnstrutor para objetos da classe Governador
     */
    public Governador()
    {
    }

    public void gravarCandidato(String numCandidato){
        if(numCandidato.length() == 2)
        {
            super.NumeroCandidato = Integer.parseInt(numCandidato);
        }
    }
}