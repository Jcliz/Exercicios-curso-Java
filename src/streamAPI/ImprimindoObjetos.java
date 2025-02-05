package streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("João", "Julia", "Joe", "Jane");

        System.out.println("Sem o Iterator...");
        for (String aprovado : aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\n" + "Usando o Iterator...");
        Iterator<String> it = aprovados.iterator();

        //se o iterador tiver um próximo, repetirá a impressão do elemento
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n" + "Usando o Stream...");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println); //laço interno
    }
}
