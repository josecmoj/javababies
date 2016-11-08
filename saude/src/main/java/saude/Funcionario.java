package br.com.stefanini.saude;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Funcionario extends Pessoa {

    int id;
    double salario;
    public String atividade;

    public int GeraId(){
        return this.id;
    }

    public double AtribuirSalario(){
        return this.salario;
    }

    public String AtribuirAtividade(){
        return this.atividade;
    }

    public Funcionario() {
    }
}
