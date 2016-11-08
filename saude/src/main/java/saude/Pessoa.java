package br.com.stefanini.saude;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public abstract class Pessoa {

    String nome;
    String cpf;
    String rg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
