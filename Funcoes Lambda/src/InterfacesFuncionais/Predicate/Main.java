package InterfacesFuncionais.Predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 750;

        Produto produto = new Produto("Yakisoba", 42.00, 0.10);
        System.out.println(isCaro.test(produto));
    }
}
