package streamAPI;

import streamAPI.Filter.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno[] alunosArray = new Aluno[] {
                new Aluno("João", 9.5),
                new Aluno("Julia", 10),
                new Aluno("Joe", 5.6)
        };
        List<Aluno> alunos = Arrays.asList(alunosArray);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

                                          //todos foram aprovados? false ou true
        System.out.println(alunos.stream().allMatch(aprovado));
                                          //algum aprovado? false ou true
        System.out.println(alunos.stream().anyMatch(aprovado));
                                          //nenhum aprovado? false ou true
        System.out.println(alunos.stream().noneMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
