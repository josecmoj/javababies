package br.com.javababies.alimentacao;

import javax.swing.JOptionPane;

import br.com.javababies.alimentacao.pessoa.Validacao;
import br.com.javababies.alimentacao.pessoa.cliente.Cliente;

public  class Alimentacao {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null,"Cadastre Novo Cliente: ","título",JOptionPane.INFORMATION_MESSAGE);



		switch (nome)  {
		case "":
			JOptionPane.showMessageDialog(null, "Erro no Cadastro");
			System.out.println(" ** ERRO NO CADASTRO ** ");
			break;
		default:

			Validacao vali = new Validacao();

			String identificacao;

			do{
				identificacao = JOptionPane.showInputDialog("Número do RG: ");
				if(!vali.ehNumero(identificacao))
					JOptionPane.showMessageDialog(null, "RG Incorreto");
			} while (!vali.ehNumero(identificacao));


			String endereco = JOptionPane.showInputDialog("Endereço ");

			String cep;

			do{
				cep = JOptionPane.showInputDialog("CEP ");
				if(!vali.ehNumero(cep))
					JOptionPane.showMessageDialog(null, "CEP Incorreto");
			} while (!vali.ehNumero(cep));

			Cliente cli = new Cliente("um", nome, identificacao, 1);

			JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO\nNome: "+cli.getNome());

			System.out.println("Nome: "+cli.getNome());
			System.out.println("Número do RG: "+cli.getDocumento());
			System.out.println("Endereço: "+endereco);
			System.out.println("CEP: "+cep);
			System.out.println(" ** CADASTRO EFETUADO ** ");
			break;

		}		
	}

}

