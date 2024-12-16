package OperadorBinario;

import java.util.function.BinaryOperator;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (x, y) -> (x + y) / 2;

        System.out.println(media.apply(9.3, 6.4));

        BiFunction<Double, Double, String> resultado =
                (x, y) -> ((x + y) / 2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado.apply(9.1, 5.4));
    }
}
