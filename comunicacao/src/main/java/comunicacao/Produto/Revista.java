package main.java.comunicacao.produto;

public class Revista extends ComunicacaoVisual {
    protected String nomeRevista;
    protected int edicaoRevista;

    public String getNomeRevista() {
        return this.nomeRevista;
    }
    public void setNomeRevista(String nomeRevista) {
        this.nomeRevista = nomeRevista;
    }
    public int getEdicaoRevista() {
        return this.edicaoRevista;
    }
    public void setEdicaoRevista(int edicaoRevista) {
        this.edicaoRevista = edicaoRevista;
    }


}
