package ru.learnup.pth.operasales.events;

import org.springframework.context.ApplicationEvent;
import ru.learnup.pth.operasales.model.Ticket;

public class BuyEvent extends ApplicationEvent {


    public BuyEvent(Ticket source) {
        super(source);
    }
}
