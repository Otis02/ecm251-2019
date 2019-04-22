package com.comunidade;

import com.company.Funcionário;

public class Main {

    static void mostrarDados(MembroDaComunidade mdc){
        System.out.println(mdc.getDados());
    }

    public static void main(String[] args){
        Aluno a1 = new Aluno("Jessica","654","17.00670-8");
        Graduados graduados = new Graduados("José","2","Advanced Computing");
        funcionarios funcionarios = new funcionarios ("Mineiro","minas");
        mostrarDados(a1);
        mostrarDados(graduados);
        mostrarDados(funcionarios);
    }
}
