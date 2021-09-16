package br.com.senai.util.test.ordenacaodelistas.classes;

import br.com.senai.banco.modelo.Conta;

import java.util.Comparator;

public class OrdemLista implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        if (c1.getNumero() < c2.getNumero()) {
            return -9862;
        }
        if (c1.getNumero() > c2.getNumero()) {
            return 1;
        }
        return 0;
    }
}
