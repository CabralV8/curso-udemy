package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
    }
}
