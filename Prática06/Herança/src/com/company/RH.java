package com.company;

public class RH {
    private double totalComissao;

    public double getTotalComissao(){
        return totalComissao;
    }

    public void adicionaComissao(Funcionário f){
        this.totalComissao += f.comissao();
    }
}
