package org.example.event;

public class Namorada implements ChegadaAniversarianteObservador {

    @Override
    public void chegou(ChegadaAniversarianteEvent evento) {
        System.out.println("Avisar os convidados");
        System.out.println("Apagar todas as luzes");
        System.out.println("Esperar um pouco");
        System.out.println("Surpresa");
    }

}
