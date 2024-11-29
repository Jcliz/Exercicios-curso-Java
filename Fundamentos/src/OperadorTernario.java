import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da média: ");

        double media = sc.nextDouble();
        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}