package org.example.event;

import java.util.Date;

public class ChegadaAniversarianteEvent {

    private final Date momento;


    public ChegadaAniversarianteEvent(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }

}
