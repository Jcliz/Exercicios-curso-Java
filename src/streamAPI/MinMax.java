package streamAPI;

import Filter.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno[] alunosArray = new Aluno[] {
                new Aluno("João", 9.5),
                new Aluno("Julia", 10),
                new Aluno("Joe", 5.6)
        };
        List<Aluno> alunos = Arrays.asList(alunosArray);

        Comparator<Aluno> melhorNota = (a1, a2) -> {
            if (a1.getNota() > a2.getNota()) return 1;
            else if (a1.getNota() < a2.getNota()) return -1;
            else return 0;
        };

        Comparator<Aluno> piorNota = (a1, a2) -> {
            if (a1.getNota() > a2.getNota()) return -1;
            else if (a1.getNota() < a2.getNota()) return 1;
            else return 0;
        };

        //para uso do min e max é necessário um Comparator

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());

        System.out.println(alunos.stream().max(piorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
