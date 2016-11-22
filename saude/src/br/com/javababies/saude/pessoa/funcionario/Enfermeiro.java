package br.com.javababies.saude.pessoa.funcionario;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Enfermeiro extends Funcionario {


    /**
     * COnstrutor para objetos da classe Enfermeiro
     */
    public Enfermeiro(String nome, String cpf, String rg, String telefone) {
    	super(nome, cpf, rg, telefone);
   }

    public String medicarPaciente(String resultado){
        return resultado;
    }

    public double AtribuirSalario(double salario, int bonus){
        return salario + bonus;
    }

    public String AtribuirAtividade(String atividade){
        return atividade;
    }
}
