package controle.desafios;

import java.util.Scanner;

public class MediaAluno {
    /**
     * 3. Criar um programa que receba duas notas parciais,
     * calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
     * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
     * caso contrário imprime no console "Reprovado".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a 1ª nota parcial: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a 2ª nota parcial: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media > 7.0) {
            System.out.println("Aprovado.");
        } else if (media < 7.0 && media > 4.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
