package br.com.senai.util.test;

import java.util.ArrayList;

public class WrapperIntegerTest {
    public static void main(String[] args) {

        int idade = 29;
        Integer idadeRef = Integer.valueOf(29);
        System.out.println(idadeRef.doubleValue());//tranformando um int em double

        System.out.println(Integer.MAX_VALUE);//Capacidade de armazenamento de um integer

        int valor = idadeRef.intValue();
        System.out.println(valor);

        String s = args[0];
        s = "10";
//        Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);//Tranformando uma String em int
        System.out.println(numero);

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);

    }
}
