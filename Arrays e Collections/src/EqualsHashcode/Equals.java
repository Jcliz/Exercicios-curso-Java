package EqualsHashcode;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("João", "joao1234@gmail.com");
        Usuario u2 = new Usuario("Julia", "julia@gmail.com");

        System.out.println("O resultado do equals é: " + u1.equals(u2));
    }
}
