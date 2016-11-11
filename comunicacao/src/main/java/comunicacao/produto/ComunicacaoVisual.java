package main.java.comunicacao.produto;

public abstract class ComunicacaoVisual {
    // declaracao de atributos
    private String nomeMidia;
    private int edicaoMidia;
    private int qtdePagina;
    private int altura;
    private int largura;
    private String cores;
    private int arte;

    // Getters e Setters

    public String getNomeMidia() {
        return this.nomeMidia;
    }
    public void setNomeMidia(String nomeMidia) {
        this.nomeMidia = nomeMidia;
    }

    public int getEdicaoMidia() {
        return this.edicaoMidia;
    }
    public void setEdicaoMidia(int edicaoMidia) {
        this.edicaoMidia = edicaoMidia;
    }

    public int getQtdePagina() {
        return this.qtdePagina;
    }
    public void setQtdePagina(int qtdePagina) {
        this.qtdePagina = qtdePagina;
    }

    public int getAltura() {
        return this.altura;
    }
    public void setAltura(int valor) {
        this.altura = valor;
    }

    public int getLargura() {
        return this.largura;
    }
    public void setLargura(int valor) {
        this.largura = valor;
    }

    public String getCores() {
        return this.cores;
    }
    public void setCores(String valor) {
        this.cores = valor;
    }

    public int getArte() {
        return this.arte;
    }
    public void setArte(int valor) {
        this.arte = valor;
    }
}
