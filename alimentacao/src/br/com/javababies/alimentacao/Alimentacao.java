package br.com.javababies.alimentacao;

import javax.swing.JOptionPane;

public class Alimentacao {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do Cliente: ").toLowerCase();
		
		switch (nome)  {
		case "marcos":
			JOptionPane.showMessageDialog(null, "NOVO CLIENTE");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Erro no Cadastro");		
				
		}
		
	
	}

}
