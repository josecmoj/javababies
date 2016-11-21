package br.com.javababies.saude.pessoa.paciente;

import br.com.javababies.saude.Recepcao;
import br.com.javababies.saude.pessoa.Pessoa;
import br.com.javababies.saude.pessoa.funcionario.Medico;

/**
 * Created by mcsilva3 on 03/11/2016.
 */
public class Paciente extends Pessoa{

    int numeroAtendimento;
    int numeroCarteirinha;
    String tipoAtendimento;
    Recepcao recepcao;
    Medico medico;

    /**
     * COnstrutor para objetos da classe Paciente
     */
    public Paciente()
    {
        recepcao = new Recepcao();
        medico = new Medico();
    }


    public boolean Pagou() {
        return true;
    }

}
