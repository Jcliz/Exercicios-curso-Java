package lambda;

import InterfacesFuncionais.Consumer.Produto;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);
        /*
        1. A partir do produto, calcular o preço real (com desconto)
        2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (isento)
        3. Frete: >= 3000 (100) / < 3000 (50)
        4. Arredondar: deixar duas casas decimais
        5. Formatar: R$ 1234,56
         */

        Function<Double, String> formatarValor =
                valor -> String.format("R$ %.2f", valor)
                        .replace(".", ",");

        BinaryOperator<Double> precoReal =
                (preco, desconto) -> preco * (1 - desconto);

        double precoDesconto = precoReal.apply(p.getPreco(), p.getDesconto());
        System.out.println("Valor real do produto (com desconto): " +
                formatarValor.apply(precoDesconto));

        Function<Double, Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        double precoFinal = impostoMunicipal.apply(precoDesconto);

        System.out.println("Imposto municipal: " +
                formatarValor.apply
                        (precoFinal - precoDesconto));

        UnaryOperator<Double> frete =
                valor -> valor < 3000 ? 50.0 : 100.0;

        double valorFrete = frete.apply(precoFinal);

        System.out.println("Valor do frete: " +
                formatarValor.apply(valorFrete));

        System.out.println("Preço a pagar (com frete): " +
                formatarValor.apply(valorFrete + precoFinal));
    }
}