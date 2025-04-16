package fundamentos;

import java.util.Scanner;

public class Temperatura03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura: ");
        double fahrenheit = scanner.nextDouble();
        final double constante = 32.0;
        final double constante2 =  5.0/9.0;
        double resultado = (fahrenheit - constante) * constante2;

        double celsius = resultado;

        System.out.printf("%sºF equivale a %.2fºC", fahrenheit, celsius);
    }
}
