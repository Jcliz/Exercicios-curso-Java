package tratamento;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println(7 / leitor.nextInt());
            leitor.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminando a execução....");
            leitor.close();
        }

        System.out.println("Fim! :D");
    }
}
