package arrays;

import java.util.Scanner;

public class NotasAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas deseja informar?");
        int quantidade = scanner.nextInt();

        double notas[] = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", (i + 1));
            notas[i] = scanner.nextDouble();
        }
        double total = 0;
        for(double nota: notas){
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("A média do aluno é: " + media);
        scanner.close();
    }
}
