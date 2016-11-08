package main.java.politica;

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
        /**teste*/
    }

    public void gravarCandidato(String numCandidatos){
        if(numCandidatos.length() == 2)
        {
            super.NumeroCandidato = Integer.parseInt(numCandidatos);
        }
    }
}