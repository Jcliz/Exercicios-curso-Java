package InterfacesFuncionais.Predicate.ComposicaoPredicado;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos =
                num -> num >= 100 && num <= 999;

        //predicate trabalha com operações lógicas
        System.out.println(isPar.and(isTresDigitos).negate().test(5));
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
