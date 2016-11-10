package main.java.comunicacao.produto;

public abstract class ComunicacaoVisual {
    // declaracao de atributos
    public int altura;
    public int largura;
    public String cores;
    public int arte;

    // Getters e Setters
    public void setAltura(int valor) {
        this.altura = valor;
    }
    public int getAltura() {
        return this.altura;
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
