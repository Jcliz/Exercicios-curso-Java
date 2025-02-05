package tratamento.Stream

import Filter.Aluno;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno[] alunosArray = new Aluno[] {
                new Aluno("João", 9.5),
                new Aluno("Julia", 10),
                new Aluno("Jane", 6.5),
                new Aluno("Joe", 5.6),
                new Aluno("Jane", 6.5),
                new Aluno("João", 9.5),
        };
        List<Aluno> alunos = Arrays.asList(alunosArray);

        //objetos únicos dentro de uma collection
        System.out.println("Uso de distinct...");
        alunos.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n" + "Uso do skip/limit...");
        alunos.stream()
                .distinct()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\n" + "Uso do takeWhile...");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.getNota() >= 7.0)
                .forEach(System.out::println);
    }
}
