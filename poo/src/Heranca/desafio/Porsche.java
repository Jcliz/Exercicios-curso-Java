package Heranca.desafio;

public class Porsche extends Carro {
    private final int torque = 10;

    public Porsche(int velocidade, String modelo) {
        super(velocidade, modelo);
    }

    @Override
    public void acelerar() {
        int velocidade = super.getVelocidade();
        velocidade += torque;

        super.setVelocidade(velocidade);
    }
}
