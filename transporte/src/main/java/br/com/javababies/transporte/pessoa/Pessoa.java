package br.com.javababies.transporte.pessoa;

import java.util.Date;

/**
 * Classe abstrata que define o que é uma pessoa no sistema
 * Created by josemoj on 16/11/16.
 */
public abstract class Pessoa {

    /**
     * Idenficador da pessoa no sistema
     */
    public String id;

    /**
     * Nome da pessoa
     */
    public String nome;

    /**
     * Documento de identificação da pessoa
     */
    public String documento;

    /**
     * Data de nascimento da pessoa
     */
    public Date nascimento;

    /**
     * Construtor padrão de pessoa
     * @param id - String identificação da pesssoa
     * @param nome - String nome da pessoa
     * @param documento - String documento da pessoa
     */
    public Pessoa(String id, String nome, String documento) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
    }
}
