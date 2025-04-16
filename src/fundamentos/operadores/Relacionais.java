package fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        System.out.println(3 > 4);
        System.out.println(3 < 4);
        System.out.println(3 >= 3);
        System.out.println(30 <= 70);
        System.out.println(30 != 70);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >=7;
        boolean temDesconto = bomComportamento && passouPorMedia;


    }
}
