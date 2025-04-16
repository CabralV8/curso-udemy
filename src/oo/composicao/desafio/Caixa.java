package oo.composicao.desafio;

public class Caixa {

    public static void main(String[] args) {
        // 1. Criar um cliente
        Cliente cliente = new Cliente();
        cliente.nome = "Mariana";

        // 2. Primeira compra
        Compra compra1 = new Compra();
        // usando o método que recebe Produto
        Produto arroz = new Produto("Arroz 5kg", 20.0);
        compra1.adicionarItem(arroz, 2);         // 2 sacos de arroz
        // usando o método que recebe nome, preço e quantidade
        compra1.adicionarItem("Feijão 1kg", 6.5, 3);
        compra1.adicionarItem("Óleo 900ml", 7.0, 1);

        // 3. Segunda compra
        Compra compra2 = new Compra();
        compra2.adicionarItem("Macarrão 500g", 4.5, 4);
        compra2.adicionarItem("Sabão em pó 1kg", 12.0, 1);

        // 4. Registrar compras no cliente
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        // 5. Exibir detalhes de cada compra
        System.out.println("=== Extrato de Compras de " + cliente.nome + " ===");
        int numero = 1;
        for (Compra compra : cliente.compras) {
            System.out.printf("Compra %d: R$ %.2f%n",
                    numero++, compra.obterValorTotal());
        }

        // 6. Exibir total geral
        System.out.printf("Total Geral: R$ %.2f%n", cliente.obterValorToral());
    }
}

