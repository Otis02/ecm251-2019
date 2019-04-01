package com.company;

public class TesteDrive {
    public static void main (String[] args){
        Funcionarios f1 = new Funcionarios("Carlos", 1000);
        System.out.println("Salário Mês: " + f1.getSalarioDoMes((1000)));
    }
}
