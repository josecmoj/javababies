package main.java.saude;

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
