package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("Fundamentos de Java");
        livros.push("Fundamentos de Python");
        livros.push("Fundamentos de C#");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop()); //retorna uma exceção se a pilha estiver vazia
    }
}
