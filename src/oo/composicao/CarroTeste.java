package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        System.out.println(c1.estaLigado());
        c1.ligar(); // chamei o método para ligar
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        //TODO encapsulamento.
        System.out.println(c1.motor.giros());

        c1.motor.carro.motor.carro.motor.carro.motor.carro.motor.giros();
    }
}
