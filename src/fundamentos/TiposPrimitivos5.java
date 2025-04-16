package fundamentos;

public class TiposPrimitivos5 {

    public static void main(String[] args) {
        // Informações do funcionário.

        // Números inteiros.
    byte anosDeEmpresa = 23;
    short numerosDeVoo = 542;
    int id = 56789;
    long pontosAcumulados = 3_134_845_223L;

    // Tipos numéricos reais.
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_445_103.01;

        // Tipo booleano.
        boolean estaDeFerias = false; // true;

        //Tipo caractere
        char status = 'A'; //Ativo.

        //Dias de empresa.
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens.
        System.out.println(numerosDeVoo / 2);

        //Pontos por real.
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + " ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
