package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Paulo", "Victor", "Parolin");

        //Lambda
        aprovados.forEach(nome ->System.out.println(nome + "!!!"));

        //Method reference
        aprovados.forEach(System.out::println);

        //Lambda 2
        aprovados.forEach(nome -> meuImprimir(nome));
    }
    static void meuImprimir(String nome){
        System.out.println("Oi meu nome é: " + nome);
    }
}
