package br.com.javababies.vestuario;

/**
 * Created by bcbertelli on 09/11/2016.
 */
public abstract class Vestuario {
    private String genero;
    private String cor;
    private String tamanho;
    private String marca;
    private double valor;

    public void gravarGenero(String generoRecebido){
        this.genero = generoRecebido;

    }
    public String retornarGenero() {
        return this.genero;

    }
    public void gravarCor(String corRecebido){
        this.cor = corRecebido;
        
    }
    public String retornarCor() {
        return this.cor;
    }
    public void gravarMarca(String marcaRecebido){
        this.marca = marcaRecebido;

    }
    public String retornarMarca() {
        return this.marca;

    }
    public void gravarTamanho(String tamanhoRecebido){
        this.tamanho = tamanhoRecebido;

    }
    public String retornarTamanho() {
        return this.tamanho;

    }

    
    public void mostrar(){
        System.out.println(this.retornarGenero());
        System.out.println(this.retornarCor());
        System.out.println(this.retornarMarca());
        System.out.println(this.retornarTamanho());
    }

}
