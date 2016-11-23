package br.com.javababies.alimentacao;

import javax.swing.JOptionPane;

public class Alimentacao {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Cadastre Novo Cliente: ").toLowerCase();
		
		switch (nome)  {
		case "marcos":
			//JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO");
			String identificacao = JOptionPane.showInputDialog("Número do RG: ").toLowerCase();
			String endereco = JOptionPane.showInputDialog("Endereço ").toLowerCase();
			String cep = JOptionPane.showInputDialog("CEP ").toLowerCase();
			JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Erro no Cadastro");
			
		}
		
		
	}

}
