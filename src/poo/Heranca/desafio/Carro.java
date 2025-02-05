package poo.Heranca.desafio;

public abstract class Carro {
    private int velocidadeAtual;
    private final String modelo;

    public Carro(int velocidadeAtual, String modelo) {
        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
    }

    public String toString() {
        return "Modelo: " + modelo + "\n" +
                "Velocidade atual: " + velocidadeAtual + "Km/h\n";
    }

    public abstract void acelerar();

    public void freiar() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
    }

    public int getVelocidade() {
        return velocidadeAtual;
    }

    public void setVelocidade(int velocidade) {
        this.velocidadeAtual = velocidade;
    }
}
