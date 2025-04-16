package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o 1º salário: ");
        String num1 = scanner.next();
        System.out.print("Insira o 2º salário: ");
        String num2 = scanner.next();
        System.out.print("Insira o 3º salário: ");
        String num3 = scanner.next();

        double valor1 = Double.parseDouble(num1.replace(",", "."));
        double valor2 = Double.parseDouble(num2.replace(",", "."));
        double valor3 = Double.parseDouble(num3.replace(",", "."));

        double soma = valor1 + valor2 + valor3;
        System.out.println("Soma dos salários: " + soma);
        System.out.println("Média dos salários: " + soma / 3);

        scanner.close();
    }
}
