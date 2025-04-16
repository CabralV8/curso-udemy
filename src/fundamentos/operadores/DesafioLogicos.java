package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        System.out.println("Televisão 50 polegadas " + (trabalho1 && trabalho2));
        System.out.println("Televisão de 32 polegadas " + (trabalho1 ^ trabalho2));
        System.out.println("Sorvete no shopping " + (trabalho1 || trabalho2));
        System.out.println("Ficar em casa " + (!trabalho1 && !trabalho2));
        System.out.println("Apenas comprar a televião " + (trabalho1 ^ trabalho2));

    }
}
