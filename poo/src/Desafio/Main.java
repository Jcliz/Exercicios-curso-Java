package Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Produto[] produtos = new Produto[] {
            new Produto("Salgadinho", 5.5),
            new Produto("Carne", 15.75),
            new Produto("Suco de laranja", 7.35)
        };

        System.out.println("""
                --__--__--__--__--__-- BEM VINDO(a) --__--__--__--__--__--
                
                Qual é o seu nome?:""");
        String nome = leitor.nextLine();
        Cliente cliente = new Cliente(nome);

        Compra compra = new Compra();
        Item item;
        double resultado = 0;
        int quantidade;

        boolean acesso = true;
        while (acesso) {
            System.out.println("""
                    
                    Vamos realizar a sua compra!
                    Opções:
                    
                    [1] - Salgadinho (R$ 5,5)
                    [2] - Carne (R$ 15,75)
                    [3] - Suco de laranja (R$ 7,35)
                    
                    [0] - Terminar as compras
                    """);

            switch (leitor.nextInt()) {
                case 1:
                    System.out.print("Quantos salgadinhos você deseja comprar?: ");
                    quantidade = leitor.nextInt();

                    item = new Item(quantidade, produtos[0]);
                    compra.adicionarItens(item);
                    break;

                case 2:
                    System.out.print("Quantas carnes você deseja comprar?: ");
                    quantidade = leitor.nextInt();

                    item = new Item(quantidade, produtos[1]);
                    compra.adicionarItens(item);
                    break;

                case 3:
                    System.out.print("Quantos sucos você deseja tomar?: ");
                    quantidade = leitor.nextInt();

                    item = new Item(quantidade, produtos[2]);
                    compra.adicionarItens(item);
                    break;

                case 0:
                    acesso = false;
                    cliente.adicionarCompra(compra);
                    System.out.printf("Valor total pago: R$ %.2f", cliente.calcularTotal());
                    System.exit(0);

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
        leitor.close();
    }
}
