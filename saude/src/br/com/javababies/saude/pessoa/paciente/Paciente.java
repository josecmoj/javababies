package br.com.javababies.saude.pessoa.paciente;


import br.com.javababies.saude.pessoa.Pessoa;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Paciente extends Pessoa{

    public int numeroAtendimento;
    public int numeroCarteirinha;
    public String tipoAtendimento;

    public Paciente(String nome, String cpf, String rg, String telefone){
    	super(nome, cpf, rg, telefone);
    	
    	/*System.out.println("Seu nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("RG: "+rg);
        System.out.println("TELEFONE: "+telefone);*/
    }
}
