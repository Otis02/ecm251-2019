package com.company;

public class Gerente {
    private String nome;
    private String RG;
    private String dataDeNascimento;
    private double salarioBase;
    private double porcentagemComissao;

    public Gerente(String nome, double salarioBase) {
        this.nome = nome;
        this.porcentagemComissao = 0.10;
        this.salarioBase = salarioBase;
    }

    public double getSalarioMes(double totalDeVendas){
        return getComissao(totalDeVendas) + this.salarioBase;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas){
        return this.porcentagemComissao * totalDeVendas + 0.5 * this.salarioBase;
    }

    public boolean aumentarSalarioBaseVendedor(Vendedor vendedor){
        if (vendedor.getGerente().equals(this)){
            return true;
        }
        else {
            return false;
        }
    }
}
