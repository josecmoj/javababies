package br.com.javaforbabies.comunicacoes.Produto;

/**
 * Created by frrodrigues1 on 01/11/2016.
 */
public abstract class ComunicaoVisual {
    // declaracao de atributos
    public float altura;
    public float largura;
    public String cores;

    // Getters e Setters
    public void setAltura(int valor) {
        this.altura = valor;
    }
    public int getAltura() {
        return this.altuura;
    }

    public void setLargura(int valor) {
        this.largura = valor;
    }
    public int getLargura() {
        return this.largura;
    }

    public void setCores(String valor) {
        this.cores = valor;
    }
    public String getCores() {
        return this.cores;
    }

    public void setArte(int valor) {
        this.arte = valor;
    }
    public int getArte() {
        return this.arte;
    }
}
