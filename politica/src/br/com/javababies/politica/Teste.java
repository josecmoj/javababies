package br.com.javababies.politica;

import java.util.Random;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
			Random rnd = new Random();
			int aleatorio;
			do{
				aleatorio = rnd.nextInt(10);
				JOptionPane.showMessageDialog(null, aleatorio);
			}while(aleatorio !=0);
	}
}

