package org.example;

import org.example.event.Namorada;
import org.example.event.Porteiro;

public class Main {
    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservadores(namorada);
        porteiro.monitorar();

    }
}