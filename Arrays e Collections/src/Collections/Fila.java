package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); //caso a fila esteja cheia, joga uma exceção
        fila.offer("Bernardo"); //caso a fila esteja cheia retorna false
        fila.add("Luciano");
        fila.offer("João");

        /*
        Peek e Element -> obter o próximo elemento da fila sem remover
        fila.clear()
        fila.size()
        fila.isEmpty() -> true ou false
        fila.poll() -> mostra o próximo da fila e remove
        fila.contains(...)
        */

        System.out.println(fila.peek()); //retorna null se a lista estiver vazia
        System.out.println(fila.element()); //lança uma exceção se estiver vazia

        //QUANDO VAZIA
        System.out.println(fila.poll()); //retorna null
        System.out.println(fila.remove()); //lança uma exceção
    }
}
