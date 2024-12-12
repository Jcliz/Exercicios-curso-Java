package InterfacesFuncionais.Consumer;

public class Produto {
    private final String nome;
    private final double preco;
    private final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = this.preco * (1 - this.desconto);
        String precoFormatado = String.format("%.2f", precoFinal);

        return "Nome: " + nome + "\n" +
                "Preço original: " + preco + "\n" +
                "Desconto: " + desconto + "\n" +
                "Preço final: " + precoFormatado + "\n";
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getNome() {
        return nome;
    }
}
