package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

//    static void metodo1() {
//        System.out.println("Início do método 1");
//        metodo2();
//        System.out.println("Fim do método 1");
//    }

    static void metodo1() {
        System.out.println("Início do método 1");
        try {
            metodo2();
        }
        catch (Exception e){
            System.out.println("Exceção pega no método 1");
            System.out.println(e);
        }
        finally {
            System.out.println("Depois do TryCatch Metodo1");
        }
        System.out.println("Fim do método 1");
    }

    static void metodo2(){
        System.out.println("início do método 2");
        int[] array = new int [10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Algo deu errado: ");
            System.out.println(e);
            throw (e);
        }
        finally {
            System.out.println("Depois do TryCatch Metodo2");
        }
        System.out.println("Fim do método 2");
    }

//    static void metodo2() {
//        System.out.println("início do método 2");
//        int[] array = new int[10];
//        for (int i = 0; i <= 15; i++) {
//            try {
//                array[i] = i;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Algo deu errado: ");
//                System.out.println(e);
//            }
//            System.out.println(i);
//        }
//        System.out.println("Fim do método 2");
//    }

//    static void metodo2() {
//        System.out.println("início do método 2");
//        int[] array = new int[10];
//        for (int i = 0; i <= 15; i++) {
//                array[i] = i;
//                System.out.println(i);
//        }
//        System.out.println("Fim do método 2");
//    }
}