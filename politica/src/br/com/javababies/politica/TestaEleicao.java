package br.com.javababies.politica;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.javababies.politica.cargo.Candidato;
import br.com.javababies.politica.cargo.CargoCandidatoEnum;
import br.com.javababies.politica.pessoa.eleitor.Eleitor;
import br.com.javababies.politica.validacao.Validacao;

/**
 * Created by jloliveira1 on 03/11/2016.
 */
public class TestaEleicao {
	static List<Eleitor> lEleito;
	static List<Candidato> lCandida;
    public static void main(String[]args){
    	String sair;
    	lEleito = new ArrayList<Eleitor>();
    	lCandida = new ArrayList<Candidato>();
    	do{
    		sair = JOptionPane.showInputDialog(null,"Escolha uma das opções:\n1 - Cadastrar Eleitor\n2 - Consultar Eleitor\n3 - Cadastrar Candidato\n4 - Consultar Candidatos\n\n0 - Sair","Menu Eleição",JOptionPane.DEFAULT_OPTION);
    		switch (sair){
    		case "0":
    			JOptionPane.showMessageDialog(null, "Saindo!!","Eleicao",JOptionPane.DEFAULT_OPTION);
    		break;
    		case "1":
    			cadastraEleitor();
        		
        		break;
    		case "2":
        		consultaEleitor();
        		break;
    		case "3":
    			cadastraCandidato();
        		break;
    		case "4":
        		consultaCandidato();
        		break;
    		default:
    			JOptionPane.showMessageDialog(null, "Opção inválida!!","Opções do Menu",JOptionPane.WARNING_MESSAGE);
    			break;
    		}
    	}while (!sair.equals("0"));
    }
    private static void consultaCandidato() {
    	if(lCandida.isEmpty()){
    		JOptionPane.showMessageDialog(null, "Nenhum Candidato cadastrado!!!","Cadidato",JOptionPane.WARNING_MESSAGE);
    	}
    	for (Candidato candidato : lCandida) {
    		JOptionPane.showMessageDialog(null, "Nome: "+candidato.retornaNome()+"\nRG: "+candidato.retornaRG()+"\nCPF: "+candidato.retornaCPF()+"\nCargo: "+candidato.getCargoCandidato()+"\nNumero Candidato: "+candidato.getNumeroCandidato(),"Candidato",JOptionPane.DEFAULT_OPTION);
		}
	}
	private static void cadastraCandidato() {
    	Validacao vali = new Validacao();
    	String nome;
    	String RG;
    	String CPF;
    	CargoCandidatoEnum cargoCandidato = CargoCandidatoEnum.PREFEITO;
    	int numeroCan = 0;
    	String numeroCandidato;
    	do{
    		nome = JOptionPane.showInputDialog(null,"Nome do Candidato ","Candidato",JOptionPane.DEFAULT_OPTION);
    	} while (nome.equals(""));
    	do{
    		RG = JOptionPane.showInputDialog(null,"Digite RG do Candidato ","Candidato",JOptionPane.DEFAULT_OPTION);
    		if(!vali.isNumeric(RG)){
    			JOptionPane.showMessageDialog(null, "RG inválido", "Candidato",JOptionPane.WARNING_MESSAGE);
    			RG = "";
    		}
    	} while (RG.equals(""));
    	do{
    		CPF = JOptionPane.showInputDialog(null,"Digite CPF do Candidato ","Candidato",JOptionPane.DEFAULT_OPTION);
    		if(!vali.isNumeric(CPF)){
    			JOptionPane.showMessageDialog(null, "CPF inválido", "Candidato",JOptionPane.WARNING_MESSAGE);
    			CPF = "";
    		}
    	} while (CPF.equals(""));
  	
    	
    	Object[] possiveisCargos = { "Prefeito", "Presidente", "Governador", "Vereador", "Deputado Federal", "Deputado Estadual" };
		Object valorSelecionado = JOptionPane.showInputDialog(null,"Escolha um cargo:", "Candidato",JOptionPane.DEFAULT_OPTION, null,possiveisCargos, possiveisCargos[0]);
		String cargo = valorSelecionado.toString();
		switch (cargo){
		case "Prefeito":
			cargoCandidato = CargoCandidatoEnum.PREFEITO;
			numeroCan = vali.aleatorio(99);
			break;
		case "Presidente":
			cargoCandidato = CargoCandidatoEnum.PRESIDENTE;
			numeroCan = vali.aleatorio(9);
			break;
		case "Governador":
			cargoCandidato = CargoCandidatoEnum.GOVERNADOR;
			numeroCan = vali.aleatorio(9999);
			break;
		case "Vereador":
			cargoCandidato = CargoCandidatoEnum.VEREADOR;
			numeroCan = vali.aleatorio(99999);
			break;
		case "Deputado Federal":
			cargoCandidato = CargoCandidatoEnum.DEPUTADOFEDERAL;
			numeroCan = vali.aleatorio(99999);
			break;
		case "Deputado Estadual":
			cargoCandidato = CargoCandidatoEnum.DEPUTADOESTADUAL;
			numeroCan = vali.aleatorio(99999);
			break;
		}
		numeroCandidato = String.valueOf(numeroCan);
    	Candidato can1 = new Candidato(nome, Integer.parseInt(RG), Integer.parseInt(CPF), cargoCandidato, numeroCandidato);
    	lCandida.add(can1);    	
    	JOptionPane.showMessageDialog(null, "Candidato incluído com sucesso!","Candidato",JOptionPane.INFORMATION_MESSAGE);		
	}
	private static void consultaEleitor() {
    	if(lEleito.isEmpty()){
    		JOptionPane.showMessageDialog(null, "Nenhum Eleitor cadastrado ","Candidato",JOptionPane.WARNING_MESSAGE);
    	}
    	for (Eleitor eleitor : lEleito) {
    		JOptionPane.showMessageDialog(null, "Nome: "+eleitor.retornaNome()+"\nRG: "+eleitor.retornaRG()+"\nCPF: "+eleitor.retornaCPF(),"Candidato",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void cadastraEleitor(){
    	Validacao vali = new Validacao();
    	String nome;
    	String RG;
    	String CPF;
    	do{
    		nome = JOptionPane.showInputDialog(null,"Nome do Eleitor ","Eleitor",JOptionPane.DEFAULT_OPTION);
    	} while (nome.equals(""));
    	do{
    		RG = JOptionPane.showInputDialog(null,"Digite RG do Eleitor ","Eleitor",JOptionPane.DEFAULT_OPTION);
    		if(!vali.isNumeric(RG)){
    			JOptionPane.showMessageDialog(null, "RG inválido","Eleitor",JOptionPane.WARNING_MESSAGE);
    			RG = "";
    		}
    	} while (RG.equals(""));
    	do{
    		CPF = JOptionPane.showInputDialog(null,"Digite CPF do Eleitor ","Eleitor",JOptionPane.DEFAULT_OPTION);
    		if(!vali.isNumeric(CPF)){
    			JOptionPane.showMessageDialog(null, "CPF inválido","Eleitor",JOptionPane.WARNING_MESSAGE);
    			CPF = "";
    		}
    	} while (CPF.equals(""));
    	Eleitor ele1 = new Eleitor(nome, Integer.parseInt(RG), Integer.parseInt(CPF));
    	lEleito.add(ele1);    	
    	JOptionPane.showMessageDialog(null, "Eleitor incluído com sucesso!","Eleitor",JOptionPane.INFORMATION_MESSAGE);
    }
}