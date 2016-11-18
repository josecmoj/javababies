package br.com.javababies.transporte.veiculo.terrestre.emplacamento;

/**
 * Created by josemoj on 16/11/16.
 */
public class Placa {

    public String letras;

    public String numeros;

    public TipoPlaca tipoPlaca;

    public Placa(String letras, String numeros, TipoPlaca tipoPlaca) {
        this.letras = letras;
        this.numeros = numeros;
        this.tipoPlaca = tipoPlaca;
    }
}
