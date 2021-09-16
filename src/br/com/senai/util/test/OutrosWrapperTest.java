package br.com.senai.util.test;

import java.util.ArrayList;
import java.util.List;

public class OutrosWrapperTest {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(27); //Autoboxing
        System.out.println(idadeRef.intValue()); //Unboxing
        System.out.println("############################");

        Double dReferencia = 3.2;
        Double dRef = Double.valueOf(3.2); //Autoboxing
        System.out.println(dRef.doubleValue()); //Unboxing
        System.out.println("#############################");

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());
        System.out.println("##############################");

        Number refNumero = Integer.valueOf(27);
        System.out.println(refNumero.intValue());

        List<Number> lista = new ArrayList<>();
        lista.add(refNumero);
        lista.add(32.6);
        lista.add(10);
        lista.add(25.6f);
        lista.add(32.6);
        lista.add(27);
        System.out.println(lista.size());
        System.out.println(lista.contains(lista));
        lista.indexOf(lista);
    }
}
