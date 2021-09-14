package br.com.senai;

import br.com.senai.banco.modelo.Conta;
import br.com.senai.banco.modelo.ContaCorrente;
import br.com.senai.banco.modelo.ContaPoupanca;

public class ArrayReferenciaTest2 {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        ContaPoupanca cp = new ContaPoupanca(123, 456);
        ContaCorrente cc = new ContaCorrente(456, 123);

        contas[1] = cc;
        System.out.println(cc.getNumero());

        contas[0] = cp;
        System.out.println(cp.getNumero());

        Conta ref = contas[0];
        System.out.println(ref.getNumero());

        System.out.println("################################");

        Object[] referencia = new Object[5];
        referencia[0] = cc;
        Object conta = (ContaCorrente) referencia[0];
        System.out.println(((ContaCorrente) referencia[0]).getNumero());

    }
}
