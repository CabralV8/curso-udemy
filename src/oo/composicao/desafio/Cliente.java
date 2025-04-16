package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;

    List<Compra> compras = new ArrayList<>();

    double obterValorToral(){
        double total = 0;

        for (Compra compra : compras){
            total += compra.obterValorTotal();
        }
        return  total;
    }
}
