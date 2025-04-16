package fundamentos;

import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println("Byte " + b.byteValue());
        System.out.println("Short " + s.toString());
        System.out.println("Integer " + i * 3);
        System.out.println("Long " + l /3);

    Boolean bo = Boolean.parseBoolean("casa");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c;
    }
}
