package main.java.politica;


import main.java.politica.eleitor.Eleitor;

/**
 * Created by jloliveira1 on 03/11/2016.
 */
public class TestaEleicao {
    public static void main(String[]args){
        Eleitor ele1=new Eleitor();
        ele1.gravarNome("Fulano");
        System.out.print(ele1.retornaNome());
    }
}
