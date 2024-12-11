package ForEachFuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("João", "Julia", "Joe", "Jane");

        System.out.println("Modo normal:");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\n" + "#1 Função Lambda:");
        aprovados.forEach(nome -> System.out.println(nome + "!"));

        System.out.println("\n" + "#1 Method reference:");
        aprovados.forEach(System.out::println);

        System.out.println("\n" + "#2 Função Lambda:");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\n" + "#2 Method reference:");
        aprovados.forEach(Foreach::meuImprimir);
    }

    public static void meuImprimir(String nome) {
        System.out.println("Meu nome é: " + nome);
    }
}