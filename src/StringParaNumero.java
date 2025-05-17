import javax.swing.*;

public class StringParaNumero {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o 1º valor.");
        String valor2 = JOptionPane.showInputDialog("Digite o 2º valor");

        System.out.println(valor1 + valor2);

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double soma = num1 + num2;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " +soma / 2);
    }
}
