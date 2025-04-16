package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da base: ");
        double base = scanner.nextDouble();
        System.out.println("Insira o valor da altura: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("A area do triângulo é de:%.2f", area);
    }
}
