package poo.Desafio;

import java.util.ArrayList;

public class Compra {
    private final ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItens (Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double valor = 0;
        for (Item item : itens) {
            valor += item.getQuantidade() * item.getProduto().getPreco();
        }
        return valor;
    }
}
