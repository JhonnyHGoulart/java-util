package br.com.senai;

import br.com.bytebank.banco.modelo.Conta;

public class GuardaContas {
    private Conta[] contas;
    private int posicaoLivre;

    public GuardaContas(){
        this.contas = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void guardadorDeContas(Conta ref) {
        this.contas[posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int quantidadeDeConta() {
        return this.posicaoLivre;
    }
}