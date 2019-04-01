package com.company;

public class Funcionarios {
    private String nome;
    private String RG;
    private String dataDeNascimento;
    private double salarioBase;
    private double porcentagemComissao;

    public Funcionarios(String nome, double salarioBase) {
        this.nome = nome;
        this.porcentagemComissao = 0.05;
        this.salarioBase = salarioBase;
    }

    public double getSalarioDoMes(double totalDeVendas){
        return this.porcentagemComissao * totalDeVendas + this.salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.porcentagemComissao * totalDeVendas;
    }
}
