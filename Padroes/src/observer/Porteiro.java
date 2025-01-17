package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    private List<ChegadaAniversarianteObserver> observadores
            = new ArrayList<>();

    public void registrarObservador(ChegadaAniversarianteObserver o) {
        observadores.add(o);
    }

    public void monitorar() {
        Scanner leitor = new Scanner(System.in);

        String valor = "";

        while (!"sair".equals(valor)) {
            System.out.println("Aniversariante chegou? ");
            valor = leitor.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                EventoChegadaAniversariante evento =
                        new EventoChegadaAniversariante(new Date());

                observadores.stream()
                        .forEach(o -> o.chegou(evento));
                valor = "sair";

            } else {
                System.out.println("Alarme falso!");
            }
        }
        leitor.close();
    }
}
