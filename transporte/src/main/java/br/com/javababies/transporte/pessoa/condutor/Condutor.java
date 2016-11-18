package br.com.javababies.transporte.pessoa.condutor;

import br.com.javababies.transporte.pessoa.Pessoa;
import br.com.javababies.transporte.pessoa.condutor.terrestre.habilitacao.Habilitacao;

/**
 * Created by josemoj on 16/11/16.
 */
public abstract class Condutor extends Pessoa{

    public Habilitacao habilitacao;

    public Condutor(String id, String nome, String documento) {
        super(id, nome, documento);
    }
}
