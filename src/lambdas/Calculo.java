package lambdas;

public interface Calculo {

     double executar(double a, double b);

     default String legal(){
          return "legal";
     }
     static String muitoLegal(){
          return "Muito legal";
     }
}
