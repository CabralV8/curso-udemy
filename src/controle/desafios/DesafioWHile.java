package controle.desafios;

import java.util.Scanner;

public class DesafioWHile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double nota = 0;
        double total = 0 ;

        System.out.println("Calculo de média");
        while (nota != -1) {
            System.out.println("Informe a nota (ou -1 p/ sair.)");
            nota = scanner.nextDouble();
            if (nota <= 10 && nota >= 0){
                total += nota;
                contador++;
            } else if (nota != 1){
                System.out.println("Nota inválida.");
            }
        }
        double media = total / contador;
        System.out.println("A média é: " + media);
    }
}
