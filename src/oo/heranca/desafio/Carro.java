package oo.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    double velocidadeAtual;
    private int delta = 5;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public Carro (int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() <= VELOCIDADE_MAXIMA) {
            velocidadeAtual += getDelta();
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }


    public void frear() {
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString(){
        return velocidadeAtual + "Km/h";
    }

}
