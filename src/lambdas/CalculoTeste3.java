package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (x, y) -> {return x + y;};
        System.out.println(soma.apply(8.0,9.0));
    }
}
