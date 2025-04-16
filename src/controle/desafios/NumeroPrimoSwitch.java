package controle.desafios;

import java.util.Scanner;

public class NumeroPrimoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorDeDivisores = 0;
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        switch (contadorDeDivisores) {
            case 0:
                System.out.println("O número " + numero + " é primo");
                break;

            default:
                System.out.println("O numero " + numero + "  não é um numero primo.");
                        break;
        }
        scanner.close();
    }
}
