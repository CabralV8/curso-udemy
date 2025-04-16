package fundamentos.exercicios;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em ºC: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9.0/5.0) + 32;
        System.out.printf("%.2fºC equivale a %.2fºF", celsius, fahrenheit);
        scanner.close();
    }
}
