package lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = p -> p.preco * (1- p.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> preco;
        Function<Double, String> formatar = preco -> String.format("R$%.2f", preco);

        Produto p = new Produto("iPad", 3235.89, 0.13);

        String resultado = precoFinal.
                andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println(resultado);
    }
}
