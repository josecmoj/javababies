package br.com.javababies.transporte.veiculo;

import br.com.javababies.transporte.motor.EstadoMotor;
import br.com.javababies.transporte.motor.Motor;
import br.com.javababies.transporte.pessoa.condutor.Condutor;

import java.util.Date;

/**
 * Classe abstrata que define o que é um veiculo
 *
 * Created by josemoj on 16/11/16.
 */
public abstract class Veiculo {

    /**
     * Idenficador do veiculo no sistema
     */
    public String id;

    /**
     * Nome do veiculo
     */
    public String nome;

    /**
     * Data da fabricacao do veiculo
     */
    public Date fabricadoEm;

    /**
     * Atual condutor do veiculo
     */
    public Condutor condutor;

    /**
     * Motor do veiculo
     */
    public Motor motor;

    /**
     * Construtor padrão do veiculo
     *
     * @param id - String identificacao do veiculo
     * @param nome - String nome do veiculo
     */
    public Veiculo(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Método que sinaliza quem vai conduzir o veiculo
     *
     * @param condutor - Instância de Condutor
     * @see Condutor
     */
    public void conduzir(Condutor condutor){
        this.condutor = condutor;
    }

    /**
     * Método que liga o veículo
     *
     * @return boolean true caso sucesso ou false em caso de insucesso
     */
    public boolean ligar(){

        if (motor != null){

            EstadoMotor estadoMotor = motor.ligar();

            switch (estadoMotor){
                case LIGADO:
                    System.out.println("Opa! Motor ligado!");
                    return true;
                case DESLIGADO:
                    System.out.println("Opa! Motor desligado!");
                    return false;
                case QUEBRADO:
                case MANUTENCAO:
                    System.out.println("Opa! Motor tá quebrado, não dá para ligar!!!!");
                    return false;
            }
            return true;
        } else {
            System.out.println("Opa! Veiculo esta sem motor!");
        }

        return false;
    }

    /**
     * Método que desliga o veiculo
     *
     * @return boolean true caso sucesso ou false caso insucesso
     */
    public boolean desligar(){

        if (motor != null){

            EstadoMotor estadoMotor = motor.desligar();

            switch (estadoMotor){
                case LIGADO:
                    System.out.println("Vixi! Motor não desligou...");
                    return true;
                case DESLIGADO:
                    System.out.println("Motor desligado!");
                    return false;
                case QUEBRADO:
                case MANUTENCAO:
                    System.out.println("Opa! Motor tá quebrado, não dá para desligar!!!!");
                    return false;
            }
            return true;
        } else {
            System.out.println("Opa! Veiculo esta sem motor!");
        }

        return false;
    }
}
