package controle.desafios;

import java.util.Scanner;

public class ElseIF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida");
            System.out.println("Apenas entre 0 e 10.");
        } else if (nota > 8.1){
            System.out.println("Conceito A");
        } else if (nota > 6.1) {
            System.out.println("Conceito B");
        } else {
            System.out.println("Conceito C");
        }
        scanner.close();
    }
}
