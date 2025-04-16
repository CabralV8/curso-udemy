package oo.composicao;

public class Carro {

    boolean portasAbertas = false;
    final Motor motor;

    Carro() {
        this.motor = new Motor(this);
    }

    void acelerar() {
        if (!portasAbertas && motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        } else if (portasAbertas) {
            System.out.println("Não é possível acelerar com as portas abertas!");
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

    void abrirPortas() {
        portasAbertas = true;
    }

    void fecharPortas() {
        portasAbertas = false;
    }

}
