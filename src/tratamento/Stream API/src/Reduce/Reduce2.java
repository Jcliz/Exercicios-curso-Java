package tratamento.Stream;

import Filter.Aluno;
import Filter.FilterEscola;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> apenasNota = a -> a.getNota();
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        FilterEscola.getAlunos().parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}
