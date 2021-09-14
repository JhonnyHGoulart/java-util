package br.com.senai;

import br.com.senai.banco.modelo.ContaCorrente;
import br.com.senai.banco.modelo.ContaPoupanca;

public class GuardaContasTest {
    public static void main(String[] args) {
        GuardaContas guardaContas = new GuardaContas();
        ContaCorrente cc = new ContaCorrente(123,456);
        ContaPoupanca cp = new ContaPoupanca(456,123);

        guardaContas.guardadorDeContas(cc);
        guardaContas.guardadorDeContas(cp);

        int tamanho = guardaContas.quantidadeDeConta();
        System.out.println(tamanho);
    }
}