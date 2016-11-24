package br.com.javababies.alimentacao.cliente.pessoa;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	public static void main(String[] args) {
		//String nome = JOptionPane.showInputDialog("Cadastre Novo Cliente: ").toLowerCase();
		String nome = JOptionPane.showInputDialog("Cadastre Novo Cliente: ");
		
		switch (nome)  {
		case "Marcos":
			//JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO");
			String identificacao = JOptionPane.showInputDialog("Número do RG: ").toLowerCase();
			String endereco = JOptionPane.showInputDialog("Endereço ").toLowerCase();
			String cep = JOptionPane.showInputDialog("CEP ").toLowerCase();
			JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO");
			System.out.println("Nome: "+nome);
			System.out.println("Número do RG: "+identificacao);
			System.out.println("Endereço: "+endereco);
			System.out.println("CEP: "+cep);
			System.out.println(" ** CADASTRO EFETUADO ** ");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Erro no Cadastro");
			
				
		}
		
		
	}

}


/**
 //* Created by mtraykavo on 03/11/2016.
 //*/
//public abstract class Pessoa {
	
	//identificacao
	//public String id;
	
	//nome da pessoa
    //public String Nome;
    
    //documento da pessoa
    //public String Doc;
   
    // 
    //double Altura;
    //double Peso;
     //public Pessoa(String id, String nome, String documento) {
     //   this.id = id;
     //   this.nome = nome;
     //   this.documento = doc;
   // }
 

//}
