package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :)");
    }

    // Exceção NÃO checada ou NÃO verificada
    static void geraErro1(){
        new RuntimeException("Aconteceu um erro bem legal! 01");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception{

       throw new Exception("Aconteceu um erro bem legal! 02");
    }
}
