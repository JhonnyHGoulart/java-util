package br.com.senai.util.test.ordenacaodelistas.classes;

import br.com.senai.banco.modelo.Conta;

import java.util.Comparator;

public class TitularDaContaComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}
