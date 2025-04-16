package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Manu", "Paula", "Igor", "Daniel");

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }
}
