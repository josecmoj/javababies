package br.com.stefanini.saude;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Enfermeiro extends Funcionario {

    //Medicamento medicamento;
    Paciente paciente;

    /**
     * COnstrutor para objetos da classe Enfermeiro
     */
    public Enfermeiro()
    {
        //medicamento = new Medicamento();
        paciente = new Paciente();
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
