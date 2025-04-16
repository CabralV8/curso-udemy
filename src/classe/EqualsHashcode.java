package classe;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Maria";
        u1.email = "maria@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Maria";
        u2.email = "maria@email.com";

        System.out.println(u1.equals(u2));
    }
}
