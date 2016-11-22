package br.com.javababies.politica;

/**
 * Created by jloliveira1 on 01/11/2016.
 */
public class Partido
{
    private int numPartido;
    private String nome;

    public void gravaNumPartido (int numPartido){
        this.numPartido = numPartido;
    }
    public int retornaNumPartido(){
        return this.numPartido;
    }
    public void gravaNomePartido(String nome){
        this.nome = nome;
    }
    public String retornaNome(){
        return this.nome;
    }
}