package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQUadrado = n -> n + n;

        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQUadrado).apply(2);
        System.out.println(resultado1);
    }
}
