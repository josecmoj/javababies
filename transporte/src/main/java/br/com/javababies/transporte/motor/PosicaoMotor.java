package br.com.javababies.transporte.motor;

/**
 * Classe que define a posição do motor no veiculo
 *
 * Created by josemoj on 17/11/16.
 */
public class PosicaoMotor {

    public String id;

    public String descricao;

    public PosicaoMotor(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;

        System.out.println("Criada a posicao de motor " + id + "-" + descricao);
    }
}
