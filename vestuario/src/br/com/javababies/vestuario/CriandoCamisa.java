package br.com.javababies.vestuario;

/**
 * Created by bcbertelli on 18/11/2016.
 */
public class CriandoCamisa {
    public static void main(String[] Args) {
        Camisa cm1=new Camisa();
        Camisa cm2=new Camisa();
        Camisa cm3=new Camisa();

        cm1.gravarGenero("Masculino");
        cm2.gravarGenero("Feminino");
        cm3.gravarGenero("Masculino");
        cm1.gravarCor("Preto");
        cm2.gravarCor("Branco");
        cm3.gravarCor("Azul");
        cm1.gravarMarca("Hurley");
        cm2.gravarMarca("Vans");
        cm3.gravarMarca("Volcom");
        cm1.gravarTamanho("P");
        cm2.gravarTamanho("G");
        cm3.gravarTamanho("M");

        cm1.mostrar();
        cm2.mostrar();
        cm3.mostrar();
    }


}
