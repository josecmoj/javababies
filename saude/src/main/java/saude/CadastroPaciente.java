package main.java.saude;


import javax.swing.*;

/**
 * Created by mcsilva3 on 09/11/2016.
 */
public class CadastroPaciente {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        String cpf = JOptionPane.showInputDialog(null, "Digite seu CPF: ");

        Paciente paciente = new Paciente();
        paciente.nome = nome;
        paciente.cpf = cpf;

        System.out.println(paciente.nome);
        System.out.println(paciente.cpf);

    }
}