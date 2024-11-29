import java.util.Scanner;

public class ConversaoTipos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i < 4; i++) {
            System.out.print("Digite o salário do servidor número " + i + ": ");

            //caso o usuário digite a casa decimal com uma vírgula o programa troca por um ponto
            String salario = leitor.nextLine().replace(",", ".");

            double salarioConvertido = Double.parseDouble(salario);
            soma += salarioConvertido;
        }

        double media = soma / 3;

        System.out.printf("Média dos salários: %.2f", media);
        leitor.close();
    }
}