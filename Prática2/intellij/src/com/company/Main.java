package com.company;

public class Main {

    public static void main(String[] args) {
	    Sayadin s1;
	    s1 = new Sayadin();
	    s1.nome = "Vegeta";
	    s1.ki = 1000.;
	    s1.odio = true;
	    Sayadin s2 = new Sayadin();
	    s2.nome = "brolly";
	    s2.ki = 1000000.;
        System.out.println(s1.nome);
        s1.treinar();
        System.out.println(s2.nome);
        s2.treinar();
    }
}
