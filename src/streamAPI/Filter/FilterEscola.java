package streamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterEscola {
    private static List<Aluno> alunos;

    public static void main(String[] args) {
        Aluno[] alunosArray = new Aluno[] {
                new Aluno("João", 9.5),
                new Aluno("Julia", 10),
                new Aluno("Jane", 6),
                new Aluno("Joe", 5.6)
        };
        alunos = Arrays.asList(alunosArray);

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;

        Function<Aluno, String> mensagem =
                aluno -> "Parabéns " + aluno.getNome() + "! A sua nota foi "
                + aluno.getNota() + "! Boas férias!";

        alunos.stream()
                .filter(aprovado)
                .map(mensagem)
                .forEach(System.out::println);
    }

    public static List<Aluno> getAlunos() {
        return alunos;
    }
}
