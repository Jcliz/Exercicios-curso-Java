package DesafioModulo;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //criação das opções de comidas
        Comida[] comidas = new Comida[] {
                new Comida("Combo de hossomaki", 0.600),
                new Comida("Combo de hot filadélfia", 0.800),
                new Comida("Temaki", 0.500),
        };

        System.out.print("""
                ---___---___--- SEJA BEM-VINDO(a) ---___---___---
                Primeiramente, nos informe seu nome:""");

        String nome = leitor.nextLine();

        System.out.print("Agora, o seu peso atual (em kg): ");
        double peso = leitor.nextDouble();

        Pessoa cliente = new Pessoa(nome, peso);

        while (true) {
            System.out.println("""
                    
                    Escolha uma opção:
                    [1] - Jantar
                    [2] - Peso do cliente
                    
                    [0] - Sair do restaurante
                    """);

            switch (leitor.nextInt()) {
                case 1:
                    boolean opcoes = true; //variável utilizada para controle de repetição
                    while (opcoes) {
                        System.out.println("""
                                
                                Opções de pratos:
                                [1] - Combo hossomaki (50 peças)
                                [2] - Combo hot filadélfia (65 peças)
                                [3] - Temaki (500g)
                                
                                [0] - Voltar
                                """);

                        switch (leitor.nextInt()) {
                            case 1:
                                System.out.println("Bom apetite! " + comidas[0].getNome() + " Entregue à mesa.");
                                cliente.comer(comidas[0]);
                                break;

                            case 2:
                                System.out.println("Bom apetite! " + comidas[1].getNome() + " Entregue à mesa.");
                                cliente.comer(comidas[1]);
                                break;

                            case 3:
                                System.out.println("Bom apetite! " + comidas[2].getNome() + " Entregue à mesa.");
                                cliente.comer(comidas[2]);
                                break;

                            case 0:
                                System.out.println("Voltando....." + "\n");
                                opcoes = false;
                                break;

                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n" + "Peso de " + cliente.getNome() + " antes de jantar: "
                            + peso);

                    System.out.print("\n" + "Peso atual de " + cliente.getNome() + " : ");
                    System.out.printf("%.2f \n", cliente.getPeso());

                    break;

                case 0:
                    System.out.println("Muito obrigado e volte sempre! :D");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
