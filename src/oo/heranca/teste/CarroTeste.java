package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari(180);
        f1.acelerar();
        f1.acelerar();
        f1.acelerar();
        f1.ligarTurbo();
        f1.acelerar();
        System.out.println(f1);
    }
}
