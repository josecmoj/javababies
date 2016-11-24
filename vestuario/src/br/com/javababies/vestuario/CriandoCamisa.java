package br.com.javababies.vestuario;

import br.com.javababies.vestuario.roupa.Camisa;

/**
 * Created by bcbertelli on 18/11/2016.
 */
public class CriandoCamisa {
    public static void main(String[] Args) {
        Camisa cm1=new Camisa(Genero.MASCULINO.toString(), Cor.AMARELO.toString(), Tamanho.GG.toString(), "Vans", 232);
        
        cm1.mostrar();
        
    }


}
