package br.com.javaforbabies.comunicacoes.Pessoa;

/**
 * Created by frrodrigues1 on 03/11/2016.
 */
public class Pessoa {
    protected int cgccpf;
    protected String nome;
    protected String tipopessoa;

    /** Metodos Personalizados
    **/
    public void status(){
        System.out.println("CGCCPF : " + this.cgccpf);
        System.out.println ("NOME  : " + this.nome);
        System.out.println ("TIPO  : " + this.tipopessoa);
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
        this.nome = tipopessoa;
    }

}
