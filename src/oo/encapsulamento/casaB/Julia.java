package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos() {
        // segredo = "Jóias";
        // facoEmCasa = "Acordo 6h";
        // formaDeFalar = "Gritando";
        // todosSabem = "Cozinha bem";

       // System.out.println(sogra.segredo);
        //System.out.println(sogra.facoEmCasa); // pacote
        //System.out.println(formaDeFalar); // heranca
        System.out.println(sogra.todosSabem);
    }

}
