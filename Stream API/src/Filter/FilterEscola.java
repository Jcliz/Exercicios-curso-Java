package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterEscola {
    public static void main(String[] args) {
        Aluno[] alunosArray = new Aluno[] {
                new Aluno("João", 9.5),
                new Aluno("Julia", 10),
                new Aluno("Jane", 6),
                new Aluno("Joe", 5.6)
        };
        List<Aluno> alunos = Arrays.asList(alunosArray);

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
        
        Function<Aluno, String> mensagem =
                aluno -> "Parabéns " + aluno.getNome() + "! A sua nota foi "
                + aluno.getNota() + "! Boas férias!";

        alunos.stream()
                .filter(aprovado)
                .map(mensagem)
                .forEach(System.out::println);
    }
}
