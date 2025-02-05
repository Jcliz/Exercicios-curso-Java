package lambda.PrimeiraFuncao;

public class MainLambda {
    public static void main(String[] args) {
        Calculo calc = (x, y) -> x + y;
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 3));
    }
}
