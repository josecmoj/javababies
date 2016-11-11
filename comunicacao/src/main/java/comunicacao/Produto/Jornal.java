package main.java.comunicacao.produto;

public class Jornal extends ComunicacaoVisual {
    protected String nomeJornal;
    protected int edicaoJornal;

    public String getNomeJornal() {
        return this.nomeJornal;
    }
    public void setNomeJornal(String nomeJornal) {
        this.nomeJornal = nomeJornal;
    }
    public int getEdicaoJornal() {
        return this.edicaoJornal;
    }
    public void setEdicaoJornal(int edicaoJornal) {
        this.edicaoJornal = edicaoJornal;
    }

}
