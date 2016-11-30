package br.com.javababies.politica;

import javax.swing.JOptionPane;

import br.com.javababies.politica.cargo.Candidato;
import br.com.javababies.politica.cargo.CargoCandidatoEnum;
import br.com.javababies.politica.pessoa.eleitor.Eleitor;
import br.com.javababies.politica.validacao.Validacao;

/**
 * Created by jloliveira1 on 03/11/2016.
 */
public class TestaEleicao {
	static Eleitor [] arrayEle;
    public static void main(String[]args){
    	String sair;
    	do{
    		sair = JOptionPane.showInputDialog("Escolha uma das opções:\n1 - Cadastrar eleitor\n2 - Cadastrar candidato\n3 - Consultar eleitores\n\n0 - Sair");
    		switch (sair){
    		case "0":
    			JOptionPane.showMessageDialog(null, "Saindo!!");
    		break;
    		case "1":
    			cadastraEleitor();
        		
        		break;
    		case "2":

        		break;
    		case "3":
        		consultaEleitor();
        		break;
    		default:
    			JOptionPane.showMessageDialog(null, "Opção inválida!!");
    			break;
    		}
    		
    	}while (!sair.equals("0"));
    	
    	
    	
    	/*
    	
    	
    	
    	Eleitor ele1 = new Eleitor("Trabalhador", 443384250, 445778954);
        Candidato can1 = new Candidato("BandidãoMor", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"45");
        Candidato can2 = new Candidato("Teste", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"456");
        Candidato can3 = new Candidato("novo teste", 157171380, 456465465, CargoCandidatoEnum.PRESIDENTE,"45sad");
        ele1.exibeDados();
        can1.exibeDados();
        can2.exibeDados();
        can3.exibeDados();*/
    }
    private static void consultaEleitor() {
    	int contador = 0;
    	boolean existe;
    	existe = false;
		do{
    		if(arrayEle[contador].retornaNome().equals("")){
    			existe = true;
    		}
    		else{
    			arrayEle[contador].exibeDados();
    			JOptionPane.showMessageDialog(null, "Nome: "+arrayEle[contador].retornaNome()+"\nRG: "+arrayEle[contador].retornaRG()+"\nCPF: "+arrayEle[contador].retornaCPF());
    		}
    		contador = contador + 1;
    	}while (!existe);
		
	}
	public static void cadastraEleitor(){
    	Validacao vali = new Validacao();
    	String nome;
    	String RG;
    	String CPF;
    	boolean incluido;
    	do{
    		nome = JOptionPane.showInputDialog("Nome do Eleitor ");
    	} while (nome.equals(""));
    	do{
    		RG = JOptionPane.showInputDialog("Digite RG do Eleitor ");
    		if(!vali.isNumeric(RG)){
    			JOptionPane.showMessageDialog(null, "RG inválido");
    			RG = "";
    		}
    	} while (RG.equals(""));
    	do{
    		CPF = JOptionPane.showInputDialog("Digite CPF do Eleitor ");
    		if(!vali.isNumeric(CPF)){
    			JOptionPane.showMessageDialog(null, "CPF inválido");
    			CPF = "";
    		}
    	} while (CPF.equals(""));
    	int contador = 0;
    	Eleitor ele1 = new Eleitor(nome, Integer.parseInt(RG), Integer.parseInt(CPF));
    	incluido = false;
		do{
    		if(arrayEle[contador].retornaNome().equals("")){
    			arrayEle[contador] = ele1;
    			JOptionPane.showMessageDialog(null, "Incluído com sucesso!");
    			incluido = true;
    		}
    		contador = contador + 1;
    	}while (!incluido);		
    }
}