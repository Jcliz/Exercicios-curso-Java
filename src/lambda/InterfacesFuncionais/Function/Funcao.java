package lambda.InterfacesFuncionais.Function;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(5));

                //param  retorno
        Function<String, String> oResultadoE =
                valor -> "Resultado: " + valor;

        System.out.println(oResultadoE.apply("21"));

        String resultadoFinal =
                parOuImpar.andThen(oResultadoE).apply(5);

        System.out.println(resultadoFinal);
    }
}
