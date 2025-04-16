package streams;

public class Padres {
    String nome;
    boolean tradicional;
    boolean confessaManha;
    boolean confessaTarde;

    public Padres(String nome, boolean tradicional, boolean confessaManha, boolean confessaTarde) {
        this.nome = nome;
        this.tradicional = tradicional;
        this.confessaManha = confessaManha;
        this.confessaTarde = confessaTarde;
    }


    @Override
    public String toString() {
        return "Padre: " + nome +
                " | Tradicional: " + (tradicional ? "Sim" : "Não") +
                " | Confessa pela manhã: " + (confessaManha ? "Sim" : "Não") +
                " | Confessa à tarde: " + (confessaTarde ? "Sim" : "Não");
    }
}