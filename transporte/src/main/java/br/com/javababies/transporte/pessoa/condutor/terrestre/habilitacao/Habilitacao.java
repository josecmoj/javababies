package br.com.javababies.transporte.pessoa.condutor.terrestre.habilitacao;

import java.time.Instant;
import java.util.Date;

/**
 * Created by josemoj on 16/11/16.
 */
public class Habilitacao {

    public Categoria categoria;

    public Date primeiraEm;

    public Date renovadaEm;

    public Date validaAte;

    public boolean estaValida(){
        return validaAte.after(Date.from(Instant.now()));
    }

    public void renovar( Date ate){
        renovadaEm = Date.from(Instant.now());
        validaAte = ate;
    }

}
