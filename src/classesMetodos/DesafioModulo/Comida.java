package classesMetodos.DesafioModulo;

public class Comida {
    private final String nome;
    private final double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }
}
