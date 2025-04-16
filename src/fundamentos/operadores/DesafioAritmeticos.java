package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {
        int superiorA = 6 * (3 + 2);
        int potenciaA = (int) Math.pow(superiorA, 2);
        int inferiorA = 3 * 2;
        int resultadoA = potenciaA / inferiorA;

        int superiorB = (1 - 5) * (2 - 7);
        int inferiorB = superiorB / 2;
        int corpoB = (int)Math.pow(inferiorB,2);

        int subtracaoSuperior = (int)Math.pow(resultadoA - corpoB, 3);
        int inferiorGeral = (int) (subtracaoSuperior / Math.pow(10,3));

        System.out.println(inferiorGeral);



    }
}
