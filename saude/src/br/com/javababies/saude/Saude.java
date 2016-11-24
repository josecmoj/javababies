package br.com.javababies.saude;

import br.com.javababies.saude.pessoa.paciente.*;

import javax.swing.JOptionPane;

import br.com.javababies.saude.pessoa.funcionario.*;

/**
 * Created by mcsilva3 on 09/11/2016.
 */
public class Saude {
	public static void main(String[] args){

		Paciente paciente = new Paciente("Jonathã Luis", "395", "48462", "994545454");  
		Medico medico = new Medico("Murilo Marques", "395", "48462", "976425290", 5631); 
		Atendente atendente = new Atendente("Juliana", "2323232", "1232312", "976425290");

		atendente.geraNumeroAtendimento();
		medico.escreverReceita(paciente.nome, medico.nome, atendente.numAtend);
		
		System.out.println(medico.receita+"\n");
		
		Paciente paciente1 = new Paciente("Paulo Monteiro", "395", "48462", "994545454");  
		Medico medico1 = new Medico("Marcos Raykavo", "395", "48462", "976425290", 5631); 
		Atendente atendente1 = new Atendente("Jean Carlos", "2323232", "1232312", "976425290");

		atendente.geraNumeroAtendimento();
		medico.escreverReceita(paciente1.nome, medico1.nome, atendente1.numAtend);
		
		System.out.println(medico.receita+"\n");
	}
}