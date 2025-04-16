package fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(6));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!! funciona igual concat");
        System.out.println(s.startsWith("Boa")); // boolean
        System.out.println(s.toLowerCase().startsWith("boa")); //letra minuscula -> boolean
        System.out.println(s.toUpperCase().endsWith("BOA")); //boolean
        System.out.println(s.length()); // int
        System.out.println(s.toLowerCase().equals("boa tarde")); // boolean
        System.out.println(s.equalsIgnoreCase("boa tarde")); // boolean

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 5478.905;

        String maisUmaFrase = "O senhor " + nome + " tem " + idade + " e recebe " + salario;
        System.out.println(maisUmaFrase);

        String frase = String.format("O senhor: %s %s tem %d anos e recebe %.2f", nome, sobrenome, idade, salario);

        System.out.printf(frase);
    }
}
