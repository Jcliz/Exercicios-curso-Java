package streamAPI.Filter;

import java.util.Objects;

public class Aluno {
    private String nome;
    private double nota;


    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "Nota: " + nota + "\n";
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(nota, aluno.nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}
