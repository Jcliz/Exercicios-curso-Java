package tratamento.Stream

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        Consumer<Integer> print = System.out::println;

        /*
        1. Número para string binária   6 => "110"
        2. Inverter a string    "110" => "011"
        3. Converter de volta para inteiro => "011" => 3
         */

        Function<Integer, String> convercaoBinaria =
                Integer::toBinaryString;

        UnaryOperator<String> inversao =
                str -> new StringBuilder(str).reverse().toString();

        Function<String, Integer> conversaoNumeral =
                num -> Integer.parseInt(num, 2);

        System.out.println("Começando a transformação dos numeros " + nums + ":");
        nums.stream()
                .map(convercaoBinaria)
                .map(inversao)
                .map(conversaoNumeral)
                .forEach(print);
    }
}
