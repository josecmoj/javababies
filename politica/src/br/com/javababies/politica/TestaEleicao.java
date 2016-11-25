package br.com.javababies.politica;

import br.com.javababies.politica.cargo.Candidato;
import br.com.javababies.politica.cargo.CargoCandidatoEnum;
import br.com.javababies.politica.pessoa.eleitor.Eleitor;

/**
 * Created by jloliveira1 on 03/11/2016.
 */
public class TestaEleicao {
    public static void main(String[]args){
    	Eleitor ele1 = new Eleitor("Trabalhador", 443384250, 445778954);
        Candidato can1 = new Candidato("BandidãoMor", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"45");
        Candidato can2 = new Candidato("Teste", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"456");
        Candidato can3 = new Candidato("novo teste", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"45sad");
        ele1.exibeDados();
        can1.exibeDados();
        can2.exibeDados();
        can3.exibeDados();
    }
}
