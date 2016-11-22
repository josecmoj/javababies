package main.java;

/**
 * Created by bcbertelli on 18/11/2016.
 */
public class CriandoCamisa {
    public static void main(String[] Args) {
        Camisa cm1=new Camisa();
        Camisa cm2=new Camisa();

        cm1.gravarGenero("Masculino");
        cm2.gravarGenero("Feminino");
        cm1.gravarCor("Preto");
        cm2.gravarCor("Branco");


        cm1.mostrar();
        cm2.mostrar();
    }


}
