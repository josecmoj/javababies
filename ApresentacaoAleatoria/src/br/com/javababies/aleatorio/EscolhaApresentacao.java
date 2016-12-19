package br.com.javababies.aleatorio;

import java.util.Random;
import javax.swing.JOptionPane;

public class EscolhaApresentacao {

	public static void main(String[] args) {
		int aleatorio;
		int opcao;
		Random rnd = new Random();
		EscolhidoEnum escolha = null, anterior;
		do{
			do{
				anterior = escolha;
				aleatorio = rnd.nextInt(EscolhidoEnum.values().length);
				escolha = EscolhidoEnum.values()[aleatorio];
			}while(anterior == escolha);			
			opcao = JOptionPane.showConfirmDialog(null, escolha,"Escolhido",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		} while (opcao != 0);
	}
}
