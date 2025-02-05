package classesMetodos.DesafioModulo;

public class Pessoa {
    private final String nome;
    private double peso;

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida c) {
        peso += c.getPeso();
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }
}
