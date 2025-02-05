package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //NÃO É PERMITIDO USAR IF
        // +, -, *, /, %
        Scanner leitor = new Scanner(System.in);

        System.out.print("\n" + "Digite um número para a operação: ");
        double num1 = leitor.nextDouble();

        System.out.print("\n" + "Digite outro número para a operação: ");
        double num2 = leitor.nextDouble();

        System.out.print("\n" + "Agora, digite qual operação você deseja realizar: ");
        String operacao = leitor.next();
        leitor.nextLine();

        double resultado = operacao.equals("+") ? num1 + num2 :
                operacao.equals("-") ? num1 - num2 :
                        operacao.equals("*") ? num1 * num2 :
                                operacao.equals("/") ? num1 / num2 :
                                        operacao.equals("%") ? num1 % num2 : 0;

        System.out.printf("\n" + "%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        leitor.close();
    }
}
