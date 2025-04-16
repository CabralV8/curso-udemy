package classe.desafioNovo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }


    String apresentar(){
        return "Oi, eu sou o " + nome +" e peso " + peso;
    }

     void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }
}
