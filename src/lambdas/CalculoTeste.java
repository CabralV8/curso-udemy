package lambdas;

public class CalculoTeste {
    public static void main(String[] args) {

        Somar soma = new Somar();
        Multiplicar multiplica = new Multiplicar();

        System.out.println(soma.executar(4,5));
        System.out.println(multiplica.executar(4,5));
    }
}
