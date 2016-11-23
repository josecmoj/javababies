package br.com.javababies.politica;

import eleitor.pessoa.EleitorCandidato;

/**
 * Created by jloliveira1 on 03/11/2016.
 */
public class TestaEleicao {
    public static void main(String[]args){
        EleitorCandidato ele1 = new EleitorCandidato("Trabalhador", 443384250, 445778954);
        EleitorCandidato can1 = new EleitorCandidato("BandidãoMor", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"45");
        ele1.exibeDados();
        can1.exibeDados();
    }
}
