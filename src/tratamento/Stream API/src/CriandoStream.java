package tratamento.Stream

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Inglês ", "Português ", "Espanhol\n");
        langs.forEach(print);

        String[] maisLangs = {
                "Francês ",
                "Mandarim ",
                "Russo\n"
        };

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("Árabe ", "Japonês ", "Coreano\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print); //desorganizado

        //Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}