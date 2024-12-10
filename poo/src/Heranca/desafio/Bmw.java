package Heranca.desafio;

public class Bmw extends Carro {
    private final int torque = 15;

    public Bmw(int velocidade, String modelo) {
        super(velocidade, modelo);
    }

    @Override
    public void acelerar() {
        int velocidade = super.getVelocidade();
        velocidade += torque;

        super.setVelocidade(velocidade);
    }
}
