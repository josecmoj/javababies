package br.com.javababies.politica;

import java.util.Random;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
			String aleatorioText;
			int opcao;
			Random rnd = new Random();
			int aleatorio;
			int i;
			int tam = 100;
			String num;
			do{
				aleatorioText = "";
				i = 0;
				do{
					
					aleatorio = rnd.nextInt(tam);
					num = String.valueOf(aleatorio);
					while (num.length()<(String.valueOf(tam).length()-1))
					{
						num = num+"0";
						aleatorioText = aleatorioText+"0";
					}
					aleatorioText = aleatorioText+String.valueOf(aleatorio)+" ";
					
					i = i+1;
					if (i == 30){
						aleatorioText = aleatorioText+"\n";
						i = 0;
					}
					
				}while(aleatorio !=0);
				//JOptionPane.showMessageDialog(null, aleatorioText.length());
				opcao = JOptionPane.showConfirmDialog(null, aleatorioText.substring(0, aleatorioText.length()), "Aleatório", JOptionPane.OK_CANCEL_OPTION);
			}while (opcao !=2);
			//JOptionPane.showMessageDialog(null, opcao);

	}
}

