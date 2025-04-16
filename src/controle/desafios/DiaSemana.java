package controle.desafios;

import java.util.Objects;
import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do dia: ");
        String dia = scanner.next();

        if ("Domingo".equalsIgnoreCase(dia)) {
            System.out.println("Domingo é o 1º dia da Semana.");
        } else if ("Segunda".equalsIgnoreCase(dia)) {
            System.out.println("Segunda é o 2º dia da Semana.");
        } else if ("Terça".equalsIgnoreCase(dia)) {
            System.out.println("Terça é o 3º dia da Semana.");
        } else if ("Quarta".equalsIgnoreCase(dia)) {
            System.out.println("Quarta é o 4º dia da Semana.");
        } else if ("Quinta".equalsIgnoreCase(dia)) {
            System.out.println("Quinta é o 5º dia da Semana.");
        } else if ("Sexta".equalsIgnoreCase(dia)) {
            System.out.println("Sexta é o 6º dia da Semana.");
        } else if ("Sábado".equalsIgnoreCase(dia)) {
            System.out.println("Sábado é o 7º dia da Semana.");
        } else {
            System.out.println("Dia inválido");
        }
        scanner.close();
    }
}