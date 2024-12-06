package Desafio;

import java.util.ArrayList;

public class Cliente {
    private final ArrayList<Compra> compras = new ArrayList<>();
    private final String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public double calcularTotal () {
        double valor = 0;
        for (Compra compra : compras) {
            valor += compra.calcularTotal();
        }
        return valor;
    }

    public void adicionarCompra(Compra compra){
        compras.add(compra);
    }
}
