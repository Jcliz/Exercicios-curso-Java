package PrimeiraFuncao;

public class Main {
    public static void main(String[] args) {
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2, 6));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 3));
    }
}
