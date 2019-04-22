package com.company;

public class Funcionário {
    protected String nome;
    protected double salario;

    public Funcionário(){
    }

    public Funcionário(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double comissao(){
        return this.salario * 0.1;
    }
}
