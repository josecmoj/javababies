package br.com.javababies.alimentacao;

import javax.swing.JOptionPane;

public abstract class Pessoa {
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
