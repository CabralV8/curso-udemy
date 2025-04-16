package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o 1º valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Insira o 2º valor: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Selecione a operação ->");
        String operacao = scanner.next();

        double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
        resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
        resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
        resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
        resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", valor1, operacao, valor2, resultado);
        scanner.close();
    }
}
