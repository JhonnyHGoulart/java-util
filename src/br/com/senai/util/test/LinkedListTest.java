package br.com.senai.util.test;

import br.com.senai.banco.modelo.Conta;
import br.com.senai.banco.modelo.ContaCorrente;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Conta> lista = new LinkedList<>();
        Conta cc = new ContaCorrente(11, 12);
        Conta cc2 = new ContaCorrente(11, 34);
        Conta cc3 = new ContaCorrente(11, 34);

        lista.add(cc);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho da lista " + lista.size());

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe?  " + existe);

        for (Conta conta : lista) {
            if (conta.equals(cc3)) {
                System.out.println("Já possui está referência!");
            }
        }

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
