package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }


    public Ferrari() {
        this(516);

    }

    @Override
    public void acelerar() {
        if (velocidadeAtual + 15 <= VELOCIDADE_MAXIMA) {
            velocidadeAtual += 15;
        } else {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
    }

    @Override
    public void frear() {
        super.frear();
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }


    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta(){
        if (ligarTurbo && !ligarAr){
            return 35;
        } else if (!ligarTurbo && !ligarAr) {
            return 30;
        } else {
            return 15;
        }
    }
}
