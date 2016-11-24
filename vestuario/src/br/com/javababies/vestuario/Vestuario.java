package br.com.javababies.vestuario;

/**
 * Created by bcbertelli on 09/11/2016.
 */
public abstract class Vestuario extends Marca{
    public String genero;
    public String cor;
    public String tamanho;
    public double valor;
    
    public Vestuario(String genero, String cor, String tamanho, String marca, double valor) {
		this.genero = genero;
		this.cor = cor;
		this.tamanho = tamanho;
		//this.marca = marca;
		gravarMarca(marca);
		this.valor = valor;
		 
    }
    
    public void mostrar(){
        System.out.println(this.genero);
        System.out.println(this.cor);
        System.out.println(retornaMarca());
        System.out.println(this.tamanho);
    }

}
