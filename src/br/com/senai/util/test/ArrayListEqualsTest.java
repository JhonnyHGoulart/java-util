package br.com.senai.util.test;

import br.com.senai.banco.modelo.Conta;
import br.com.senai.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class ArrayListEqualsTest {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        Conta cc = new ContaCorrente(321, 123);
        Conta cc2 = new ContaCorrente(11, 22);
        Conta cc3 = new ContaCorrente(11, 22);

        lista.add(cc2);
        lista.add(cc);

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho da lista "+lista.size());

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe? "+existe);

        for (Conta conta : lista) {
            if (conta.equals(cc3)) {
                System.out.println("Já possui essa referência!");
            }
        }

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
