package br.com.javababies.vestuario;

public class CriandoCalca {
	 public static void main(String[] Args) {
	        Calca cl1=new Calca();
	        Calca cl2=new Calca();
	        Calca cl3=new Calca();

	        cl1.gravarGenero("Masculino");
	        cl2.gravarGenero("Feminino");
	        cl3.gravarGenero("Masculino");
	        cl1.gravarCor("Jeans Preto");
	        cl2.gravarCor("Jeans");
	        cl3.gravarCor("Sarja");
	        cl1.gravarMarca("Hurley");
	        cl2.gravarMarca("Vans");
	        cl3.gravarMarca("Volcom");
	        cl1.gravarTamanho("44");
	        cl2.gravarTamanho("46");
	        cl3.gravarTamanho("48");

	        cl1.mostrar();
	        cl2.mostrar();
	        cl3.mostrar();
	    }


}
