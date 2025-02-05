package collections.Collections.lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("João");
        lista.add(u1);
        lista.add(new Usuario("Julia"));

        System.out.println(lista.get(1));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

        lista.remove(1);
        lista.remove(new Usuario("Joao"));
        System.out.println("João está na lista?: " + lista.contains(u1));
    }
}
