package lambda.InterfacesFuncionais.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.getNome());

        Produto p = new Produto("Yunu Uchuhai", 32.00, 0.15);
        Produto p2 = new Produto("Computador", 3201.64, 0.35);
        Produto p3 = new Produto("Monitor", 702.21, 0.25);
        Produto p4 = new Produto("Mouse", 92.53, 0.10);
        imprimir.accept(p);

        List<Produto> produtos = Arrays.asList(p, p2, p3, p4);

        produtos.forEach(imprimir);
        produtos.forEach(prod -> System.out.println(prod.getPreco()));
        produtos.forEach(System.out::println);
    }
}
