package br.com.javababies.politica;

import br.com.javababies.politica.eleitor.pessoa.EleitorCandidato;

/**
 * Created by jloliveira1 on 03/11/2016.
 */
public class TestaEleicao {
    public static void main(String[]args){
        EleitorCandidato ele1 = new EleitorCandidato("Trabalhador", 443384250, 445778954);
        EleitorCandidato can1 = new EleitorCandidato("BandidãoMor", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"45");
        EleitorCandidato can2 = new EleitorCandidato("Teste", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"456");
        EleitorCandidato can3 = new EleitorCandidato("novo teste", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"45sad");
        ele1.exibeDados();
        can1.exibeDados();
        can2.exibeDados();
        can3.exibeDados();
    }
}
