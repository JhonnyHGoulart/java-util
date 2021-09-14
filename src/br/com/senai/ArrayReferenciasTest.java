package br.com.senai;

import br.com.senai.banco.modelo.ContaCorrente;

public class ArrayReferenciasTest {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(123, 456);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(789, 852);
        contas[1] = cc2;

        System.out.println(contas[1].getNumero());
        ContaCorrente ref = contas[1];

        System.out.println(ref.getNumero());
        System.out.println(cc2.getNumero());

    }
}
