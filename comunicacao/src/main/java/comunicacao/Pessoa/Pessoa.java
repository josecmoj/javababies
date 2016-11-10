package main.java.comunicacao.pessoa;

public abstract class Pessoa {
    protected int cgccpf;
    protected String nome;
    protected String tipopessoa;

    /** Metodos Personalizados
    **/
    public void status(){
        System.out.println("CGCCPF : " + getCgccpf());
        System.out.println ("NOME  : " + getNome());
        System.out.println ("TIPO  : " + getTipopessoa());
    }

    /** Metodos Especiais
    **/
    public int getCgccpf() {
        return this.cgccpf;
    }
    public void setCgccpf(int cgccpf) {
        this.cgccpf = cgccpf;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipopessoa() {
        return this.tipopessoa;
    }
    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

}
