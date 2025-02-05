package lambda.PrimeiraFuncao;

import java.util.function.BinaryOperator;

public class MainLambda2 {
    public static void main(String[] args) {

        //interface de operações binárias do Java
        //recebe dois parâmetros de um tipo e retorna o mesmo tipo
        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));
    }
}
