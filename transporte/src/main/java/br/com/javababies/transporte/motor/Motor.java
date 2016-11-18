package br.com.javababies.transporte.motor;

/**
 * Created by josemoj on 17/11/16.
 */
public class Motor {

    public String id;

    public String modelo;

    public EstadoMotor estadoMotor;

    public PosicaoMotor posicaoMotor;

    public Motor(String id, String modelo, EstadoMotor estadoMotor, PosicaoMotor posicaoMotor) {
        this.id = id;
        this.modelo = modelo;
        this.estadoMotor = estadoMotor;
        this.posicaoMotor = posicaoMotor;
    }

    public EstadoMotor ligar() {

        if (estadoMotor != null){

            if (estadoMotor.equals(EstadoMotor.DESLIGADO)){
                estadoMotor = EstadoMotor.LIGADO;
                System.out.println("VRUMMMM");

            } else if (estadoMotor.equals(EstadoMotor.LIGADO)){
                System.out.println("OW! MOTOR JA TA LIGADO!");
            } else {
                System.out.println("OW! MOTOR QUEBRADO!");
            }

        } else {

            System.out.println("OW: NAO SEI O QUE FAZER!");
        }

        return estadoMotor;
    }

    public EstadoMotor desligar() {

        if (estadoMotor != null){

            if (estadoMotor.equals(EstadoMotor.LIGADO)){
                estadoMotor = EstadoMotor.DESLIGADO;
                System.out.println("...");

            } else if (estadoMotor.equals(EstadoMotor.DESLIGADO)){
                System.out.println("OW! MOTOR JA TA DESLIGADO!");
            } else {
                System.out.println("OW! MOTOR QUEBRADO!");
            }

        } else {

            System.out.println("OW: NAO SEI O QUE FAZER!");
        }

        return estadoMotor;
    }
}
