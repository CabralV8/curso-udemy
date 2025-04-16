package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.1456789;
        System.out.println(b);

        int c = 340;
        byte d = (byte) c;

        double e = 1;
        int f = (int) e;
        System.out.println(f);

    }
}
