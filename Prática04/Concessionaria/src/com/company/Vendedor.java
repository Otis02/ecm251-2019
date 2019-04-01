package com.company;

public class Vendedor {
    private String nome;
    private String RG;
    private String dataDeNascimento;
    private double salarioBase;
    private double porcentagemComissao;
    private Gerente gerente;

    public Vendedor(String nome, double salarioBase, Gerente gerente) {
        this.nome = nome;
        this.porcentagemComissao = 0.05;
        this.salarioBase = salarioBase;
        this.gerente = gerente;
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

    public Gerente getGerente(){
        return gerente;
    }
}
