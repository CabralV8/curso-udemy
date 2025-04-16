package fundamentos.exercicios;

import java.util.Scanner;

public class TabelaIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua massa em Kg: ");
        double massa = scanner.nextDouble();
        System.out.print("Informe sua altura em m: ");
        double altura = scanner.nextDouble();
        double calculo = massa / Math.pow(altura, 2);
        System.out.printf("Seu IMC é de: %.2f", calculo);
        scanner.close();
    }
}
