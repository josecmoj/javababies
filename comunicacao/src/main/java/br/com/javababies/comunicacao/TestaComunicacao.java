package main.java.br.com.javababies.comunicacao;

import main.java.comunicacao.pessoa.Cliente;
import main.java.comunicacao.pessoa.Funcionario;

public class TestaComunicacao {

	public static void main(String[] args) {
		Funcionario wrkFuncionario1 = new Funcionario("Nome1", "PF", 1234, "Consultor", 897);
		Funcionario wrkFuncionario2 = new Funcionario("Nome2", "PF", 5678, "Consultor", 742);
		Cliente wrkCliente = new Cliente("Cliente1","PJ",98765);
		wrkFuncionario1.exibeDados();
		wrkFuncionario2.exibeDados();
		wrkCliente.exibeDados();

	}

}
