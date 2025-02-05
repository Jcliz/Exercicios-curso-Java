package tratamento.Stream

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("bmw", "audi", "mercedes", "honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\nUsando composição...");
        marcas.stream()
                .map(Utils.maiuscula)
                .map(Utils.primeiraLetra)
                .map(Utils::grito)
                .forEach(print);
    }
}
