package fundamentos.exercicios;

import java.util.Scanner;

public class AoQuadradoAoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        int valor = scanner.nextInt();
        System.out.printf("%d elevado ao quadrado:%.2f",valor, Math.pow(valor, 2));
        System.out.printf("\n%d elevado ao cubo:%.2f",valor, Math.pow(valor, 3));
        scanner.close();
    }
}
