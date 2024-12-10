package Heranca;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.setPosicaoX(11);
        heroi.setPosicaoY(19);

        Monstro monstro = new Monstro();
        monstro.setPosicaoX(11);
        monstro.setPosicaoY(20);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        heroi.andar(Direcao.NORTE);
        heroi.andar(Direcao.NORTE);
        monstro.andar(Direcao.NORTE);

        System.out.println(heroi);
        System.out.println(monstro);
    }
}
