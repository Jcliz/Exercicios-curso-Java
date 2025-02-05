package streamAPI.Reduce;

import Filter.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno[] alunosArray = new Aluno[] {
                new Aluno("João", 9.5),
                new Aluno("Julia", 10),
                new Aluno("Jane", 6),
                new Aluno("Joe", 5.6)
        };
        List<Aluno> alunos = Arrays.asList(alunosArray);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> apenasNota = Aluno::getNota;

        BiFunction<Media, Double, Media> calcularMedia =
                Media::adicionar;

        BinaryOperator<Media> combinarMedia =
                Media::combinar;

        Media media = alunos.stream()
                //.filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        System.out.printf("A média da turma é: %.2f", media.getValor());
    }
}
