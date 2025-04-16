package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DioceseBelem {
    public static void main(String[] args) {


        Padres p1 = new Padres("Ivan", true, true, true);
        Padres p2 = new Padres("Lucas", true, false, true);
        Padres p3 = new Padres("João Paulo", false, true, false);

        List<Padres> padres = Arrays.asList(p1, p2, p3);

        Predicate<Padres> tradicionalista = p -> p.tradicional;
        Predicate<Padres> continuista = p -> !p.tradicional;

        Function<Padres, String> missaTridentina =
                p -> "O padre " + p.nome + " reza a Missa de Sempre.";

        Predicate<Padres> confessaSoManha = p -> p.confessaManha && !p.confessaTarde;
        Predicate<Padres> confessaSoTarde = p -> !p.confessaManha && p.confessaTarde;

        System.out.println("=== Padres tradicionalistas ===");
        padres.stream()
                .filter(tradicionalista)
                .map(missaTridentina)
                .forEach(System.out::println);

        System.out.println("\n=== Padres que só confessam pela manhã ===");
        padres.stream()
                .filter(confessaSoManha)
                .forEach(System.out::println);

        System.out.println("\n=== Padres que só confessam à tarde ===");
        padres.stream()
                .filter(confessaSoTarde)
                .forEach(System.out::println);
    }
}