package com.company;

public class Gerente extends Funcionário{

    public Gerente (String nome, int senha){
        super(nome);
        this.senha = senha;
    }

    private int senha;

    public boolean autenticar(int senha){
        return senha == this.senha;
    }

    @Override
    public double comissao() {
        return 0.6 *  super.salario;
    }
}
