package streams;

import streams.Aluno;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Reduce2 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Ana", 7.1),
                new Aluno("Luna", 6.1),
                new Aluno("Gui", 8.1),
                new Aluno("Gabi", 10.0)
        );

        DoubleSummaryStatistics stats = alunos.stream()
                .filter(a -> a.getNota() >= 7.0)
                .mapToDouble(Aluno::getNota)
                .summaryStatistics();

        System.out.printf("Aprovados: %d%n", stats.getCount());
        System.out.printf("Soma das notas: %.2f%n", stats.getSum());
        System.out.printf("Média das notas: %.2f%n", stats.getAverage());
        System.out.printf("Maior nota: %.2f%n", stats.getMax());
        System.out.printf("Menor nota: %.2f%n", stats.getMin());
    }
}