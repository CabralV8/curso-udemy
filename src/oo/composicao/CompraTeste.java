package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();

        c1.cliente = "João Pedro";
        c1.itens.add(new Item("Lápis", 5, 2.80));
        c1.itens.add(new Item("Mochila", 2, 109.99));
        c1.itens.add(new Item("Estojo", 4, 32.70));


        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());
    }
}
