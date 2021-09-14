package br.com.senai.util.test;

import br.com.senai.banco.modelo.Conta;
import br.com.senai.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        Conta cc = new ContaCorrente(11,12);
        Conta cc2 = new ContaCorrente(11,34);
        Conta cc3 = new ContaCorrente(11,56);
        Conta cc4 = new ContaCorrente(11,78);

        lista.add(cc2);
        lista.add(cc);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho da lista "+lista.size());

        for(int i = 0; i < lista.size(); i++){
            Object oRef =  lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("########################");

        for(Conta conta : lista){
            System.out.println(conta);
        }
    }
}
