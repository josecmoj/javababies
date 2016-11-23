package br.com.javababies.politica.eleitor.pessoa;


/**
 * Created by jloliveira1 on 31/10/2016.
 */
public abstract class Pessoa {
    private String nome;
    private int RG;
    private int CPF;
    
    public Pessoa(String nome, int RG, int CPF) {
    	gravarNome(nome);
    	gravarRG(RG);
    	gravarCPF(CPF);
    }

    private void gravarNome (String nome){
        this.nome = nome;
    }
    private void gravarRG (int RG){
        this.RG = RG;
    }
    private void gravarCPF (int CPF){
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
    public abstract void exibeDados();

}
