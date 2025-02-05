package poo.Heranca;

public class Jogador {
    private int vida = 100;
    private int posicaoX;
    private int posicaoY;

    @Override
    public String toString() {
        return "Vida = " + vida + "\n" +
                "Posição X = " + posicaoX + "\n" +
                "Posicao Y = " + posicaoY + "\n";
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                posicaoY--;
                break;

            case SUL:
                posicaoY++;
                break;

            case LESTE:
                posicaoX++;
                break;

            case OESTE:
                posicaoX--;
                break;
        }

        return true;
    }

    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(posicaoX - oponente.getX());
        int deltaY = Math.abs(posicaoY - oponente.getY());

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
            return true;

        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;

        } else {
            return false;
        }
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getX() {
        return posicaoX;
    }

    public int getY() {
        return posicaoY;
    }

    public int getVida() {
        return vida;
    }
}