package com.company;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayListTesteDrive {
    public static void main(String[] args){
        List<Item> Lista = new ArrayList<Item>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Informe o ID e Nome:");
            int id = scanner.nextInt();
            String nome = scanner.next();
            Lista.add(new Item(id, nome));
            System.out.println("Continuar?");
            if(scanner.nextInt() == 0) break;
        }
        System.out.println("Tamanho da lista: " + Lista.size());
        System.out.println(" Itens da lista: ");
        for (Item i: Lista){
            System.out.println(" Item: " + i);
        }
    }
}
