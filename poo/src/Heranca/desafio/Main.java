package Heranca.desafio;

public class Main {
    public static void main(String[] args) {
        Carro bmwM3 = new Bmw(10, "BMW m3 e30");
        Carro porsche911 = new Porsche( 20, "Porsche 911");

        System.out.println("Acelerando!!!" + "\n");

        for (int i = 0; i < 5; i++) {
            bmwM3.acelerar();
            System.out.println(bmwM3);

            porsche911.acelerar();
            System.out.println(porsche911);
        }

        System.out.println("Agora vamos freiar..." + "\n");

        for (int i = 0; i < 3; i++) {
            bmwM3.freiar();
            porsche911.freiar();
        }

        System.out.println("RESULTADOS FINAIS:" + "\n");
        System.out.println(bmwM3);
        System.out.println(porsche911);
    }
}
