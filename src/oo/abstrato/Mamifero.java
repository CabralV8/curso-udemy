package oo.abstrato;

public abstract class Mamifero extends Animal {

    @Override
    public String respirar() {
        return super.respirar();
    }

    @Override
    public String mover() {
        return "Patas";
    }
    public abstract String mamar();
}
