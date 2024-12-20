package Filter;

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
}
