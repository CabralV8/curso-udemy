package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador(7,8);
        j1.x = 10;
        j1.y = 10;
        System.out.println(j1.vida);
        Monstro m1 = new Monstro(5, 6);
        m1.x = 10;
        m1.y = 10;

        m1.andar(Direcao.NORTE);
        m1.andar(Direcao.LESTE);
        m1.andar(Direcao.NORTE);
        m1.andar(Direcao.LESTE);
        m1.andar(Direcao.LESTE);

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);

        System.out.println(j1.x);
        System.out.println(j1.y);

        System.out.println(m1.x);
        System.out.println(m1.y);

        m1.atacar(j1);

        System.out.println(j1.vida);
    }
}
