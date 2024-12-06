package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "João");
        //usuarios.put(1, "João Pedro");   ->   vai substituir o valor de nome do primeiro usuário
        usuarios.put(2, "Julia");
        usuarios.put(3, "John Doe");
        usuarios.put(4, "Jane Doe");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("João"));

        System.out.println(usuarios.get(2));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        //percorre por uma linha completa, ou seja, printa um usuário
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }

    }
}
