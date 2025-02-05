package collections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos alunos?: ");
        int qtdeAlunos = leitor.nextInt();

        System.out.print("Quantas notas por aluno?: ");
        int qtdeNotas = leitor.nextInt();

        double[][] notas = new double[qtdeAlunos][qtdeNotas];

        double soma = 0;
        for (int i = 0; i < qtdeAlunos; i++) {
            for (int j = 0; j < qtdeNotas; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notas[i][j] = leitor.nextDouble();
                soma += notas[i][j];
            }
        }

        double media = soma / (qtdeAlunos * qtdeNotas);
        System.out.printf("Média dos alunos: %.2f", media);

        leitor.close();
    }
}