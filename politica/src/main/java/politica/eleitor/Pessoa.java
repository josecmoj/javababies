package br.com.javababies.politica.eleitor;

/**
 * Created by jloliveira1 on 31/10/2016.
 */
public abstract class Pessoa {
    private String nome;
    private int RG;
    private int CPF;

    public void gravarNome (String nome){
        this.nome = nome;
    }
    public void gravarRG (int RG){
        this.RG = RG;
    }
    public void gravarCPF (int CPF){
        this.CPF = CPF;
    }
    public String retornaNome(){
        return this.nome;
    }
    public int retornaRG(){
        return RG;
    }
    public int retornaCPF(){
        return CPF;
    }

}
