package com.company;

public class TesteMinhaExceção {
    public static void main(String[] args) {
        String frase = "biboca";
        try {
            testaFrase(frase);
        } catch (SemLetraException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        System.out.println(frase);
    }

    public static void testaFrase (String frase) throws SemLetraException{
        if (!frase.toUpperCase().contains("B")){
            throw new SemLetraException();
        }
    }
}
