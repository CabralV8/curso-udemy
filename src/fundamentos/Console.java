package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia\n");

        System.out.println("BOM");
        System.out.println("DIA");

        System.out.printf("Megasena: %d, %d, %d, %d, %d, %d",1 , 6, 9, 44, 7, 12);
        System.out.printf("Salário: %.2f%n", 4587.56);
        System.out.printf("Nome: %s%n", "João");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // .nextLine adiciona um '\n' no final da execução.

        System.out.print("Digite seu Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("O senhor - %s %s tem %d anos. %n", nome, sobrenome, idade);

        scanner.close();
    }
}
