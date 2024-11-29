package Desafios;

public class DesafioFor {
    public static void main(String[] args) {
        //Manipulação da repetição sem utilizar valores numéricos

        for (String valor = "#";!valor.equals("######"); valor += "#") {
            System.out.println(valor);
        }
    }
}
