package Heranca.desafio;

public abstract class Carro {
    private int velocidadeAtual;
    private final String modelo;

    public Carro(int velocidadeAtual, String modelo) {
        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
    }

    public String toString() {
        return "Modelo: " + modelo + "\n" +
                "Velocidade: " + velocidadeAtual + "\n";
    }

    public abstract void acelerar();

    public void freiar() {
        velocidadeAtual -= 10;
    }

    public int getVelocidade() {
        return velocidadeAtual;
    }

    public void setVelocidade(int velocidade) {
        this.velocidadeAtual = velocidade;
    }
}
