package br.com.javababies.vestuario;

import br.com.javababies.vestuario.roupa.Calca;

public class CriandoCalca {
    public static void main(String[] Args) {
        Calca cl1=new Calca(Genero.MASCULINO.toString(), Cor.AMARELO.toString(), Tamanho.GG.toString(), "Vans", 232);
        
        cl1.mostrar();

    }
}
