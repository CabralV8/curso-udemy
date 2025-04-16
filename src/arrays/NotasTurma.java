package arrays;

import java.util.Scanner;

public class NotasTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quantos alunos: ");
        int alunos = scanner.nextInt();

        System.out.print("Informe quantas notas: ");
        int notas = scanner.nextInt();

        double [][] notasDaTurma = new double[alunos][notas];
        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a %dª nota do %dº aluno: ", j + 1, i + 1);
                notasDaTurma[i][j] = scanner.nextDouble();
                total += notasDaTurma[j][i];
            }
        }
        double media = total / (notas * alunos);
        System.out.printf("A média da turma é %.2f", media);
    }
}
