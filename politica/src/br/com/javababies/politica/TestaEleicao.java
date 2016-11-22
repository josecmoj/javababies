package br.com.javababies.politica;

import eleitor.pessoa.EleitorCandidato;

/**
 * Created by jloliveira1 on 03/11/2016.
 */
public class TestaEleicao {
    public static void main(String[]args){
        EleitorCandidato ele1 = new EleitorCandidato();
        ele1.gravarNome("Fulano");
        System.out.print(ele1.retornaNome());
    }
}
