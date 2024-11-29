package Desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        double nota = 0;
        int quantidade = 0;

        while (nota != -1.0) {
            System.out.print("Digite a nota do aluno, ou -1 para sair: ");
            nota = leitor.nextDouble();

            if (nota >= 0 && nota <=10) {
                soma += nota;
                quantidade++;
            } else if (nota == -1){
                System.out.println("Terminando a leitura!");
            } else {
                System.out.println("Nota inválida! Tente novamente!");
            }
        }
        double media = soma / quantidade;

        System.out.printf("Média dos alunos: %.2f", media);
    }
}