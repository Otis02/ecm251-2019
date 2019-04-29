package com.company;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        //Scanner scanner = new Scanner(System.in);
        //for (int i = 0; i < 3; i++){
        //  String nome = scanner.next();
        //if(listaDeCompras.addProduto(new Produto(nome))){
        //  System.out.println("Produto Adicionado!");
        // }
        //else {
        //   System.out.println("Erro!");
        //}
        // }
        // }

        listaDeCompras.addProduto(new Produto("a"));
        listaDeCompras.addProduto(new Produto("b"));
        if (listaDeCompras.Remover("a"))
            System.out.println("Removido com sucesso.");
        if (listaDeCompras.Remover("c"))
            System.out.println("Removido com sucesso.");
        else
            System.out.println("Erro ao remover!");
    }
}
