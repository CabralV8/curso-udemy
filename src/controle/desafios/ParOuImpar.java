package controle.desafios;

import java.util.Scanner;

public class ParOuImpar {
    /*1. Criar um programa que receba um número
     e verifique se ele está entre 0 e 10 e é par;*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {

            System.out.print("Digite um número entre 0 e 10: ");
            numero = scanner.nextInt();

            if (numero >= 0 && numero <= 10) {
                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é PAR.");
                } else {
                    System.out.println("O número " + numero + " é ÍMPAR.");
                }
            } else {
                System.out.println("Número inválido! Tente novamente.");
            }


        } while (numero < 0 || numero > 10);
        scanner.close();
    }
}
