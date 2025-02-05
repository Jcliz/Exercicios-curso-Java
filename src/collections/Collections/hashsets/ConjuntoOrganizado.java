package collections.Collections.hashsets;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<>();
        Set<String> lista = new TreeSet<>(); //respeita a ordem de inserção
        lista.add("Oi");
        lista.add("Tchau");
        lista.add("João");
        lista.add("Julia");

        for (String candidatos : lista) {
            System.out.println("Candidatos");
        }
    }
}
