package br.com.senai.util.test.ordenacaodelistas.test;

import br.com.senai.banco.modelo.Conta;
import br.com.senai.banco.modelo.ContaCorrente;
import br.com.senai.banco.modelo.ContaPoupanca;
import br.com.senai.util.test.ordenacaodelistas.classes.OrdemLista;

import java.util.ArrayList;
import java.util.List;

public class OrdemListaTest {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println("#######################");

        OrdemLista comparator = new OrdemLista();
        lista.sort(comparator);
        System.out.println(comparator);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}

