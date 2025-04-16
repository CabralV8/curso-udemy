package classe;

public class AreaCirc {

    double raio;
    final static double PI = 3.14159265358979323846;

    AreaCirc(double raio) {
        this.raio = raio;
    }
    double area(){
        return PI * Math.pow(raio, 2);
    }

    double area(double raio){
        return PI * Math.pow(raio, 2);
    }
}
