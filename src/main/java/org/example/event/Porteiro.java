package org.example.event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();

    public void registrarObservadores(ChegadaAniversarianteObservador observador) {
        observadores.add(observador);

    }

    public void monitorar() {
        Scanner sc = new Scanner(System.in);
        String valor = " ";

        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou? ");
            valor = sc.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                // Criar o evento
                ChegadaAniversarianteEvent evento = new ChegadaAniversarianteEvent(new Date());

                // Avisará os observadores"
                observadores.forEach(o -> o.chegou(evento));

                break;
            } else {
                System.out.println("Alarme Falso");
            }
        }
    }

}
