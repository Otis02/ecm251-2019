package com.comunidade;

public class MembroDaComunidade {
    protected String nome;
    protected String cpf;

    public MembroDaComunidade(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getDados(){
        return nome + '\t' + cpf;
    }
}
