package br.com.javababies.transporte.veiculo.terrestre;

import br.com.javababies.transporte.veiculo.Veiculo;
import br.com.javababies.transporte.veiculo.terrestre.emplacamento.Placa;

/**
 * Classe que define um veiculo do tipo automável
 *
 * Created by josemoj on 17/11/16.
 */
public class Automovel extends Veiculo {

    /**
     * Placa do veículo
     */
    public Placa placa;

    /**
     * Construtor padrão de automável
     *
     * @param id - String -  identificador do Automável
     * @param nome - String - Nome do automável
     */
    public Automovel(String id, String nome) {
        super(id, nome);
        System.out.println("Criado o automóvel " + id + "-" + nome);
    }
}
