package streams;

import java.util.Arrays;
import java.util.List;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        // Usando collect() em vez de reduce()
        Media media = alunos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(Aluno::getNota)
                .collect(
                        Media::new,
                        Media::adicionar,
                        Media::combinar
                );

        System.out.printf("Média dos aprovados: %.2f%n", media.getValor());
    }
}
