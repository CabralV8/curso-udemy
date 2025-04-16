package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitParaCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32)  / 1.8;
        System.out.printf("%.2fºF equivale a %.2fºC", fahrenheit, celsius);
        scanner.close();
    }
}
