package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java, ", "Lua, ", "JS\n");

        langs.forEach(print);

        String[] maisLangs = {"Phyton, ", "Lisp, ", "Perls, ", "Go\n"};

        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "PhP", " Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);
    }
}
