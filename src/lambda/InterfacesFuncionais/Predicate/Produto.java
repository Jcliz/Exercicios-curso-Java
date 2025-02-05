package lambda.InterfacesFuncionais.Predicate;

public class Produto {
    private final String nome;
    private final double preco;
    private final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }
}
