package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Notebook", 1350, 0.15);
        imprimir.accept(p1);

        Produto p2 = new Produto("Caneta", 12.80,0.5);
        Produto p3 = new Produto("Caderno", 35.99,0.15);
        Produto p4 = new Produto("Borracha", 7.70,0.10);
        Produto p5 = new Produto("Régua", 35.45,0.5);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(System.out::print);
    }
}
