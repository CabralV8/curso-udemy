package classe.desafioNovo;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.25);

        Pessoa p1 = new Pessoa("Fábio", 82.25);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
    }
}
