package ru.learnup.pth.operasales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.pth.operasales.repository.entities.EventEntity;
import ru.learnup.pth.operasales.repository.entities.TicketEntity;
import ru.learnup.pth.operasales.services.EventService;
import ru.learnup.pth.operasales.services.TicketService;

import java.util.List;

@SpringBootApplication
public class OperaSalesApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(OperaSalesApplication.class, args);


        ctx.getBean(TicketService.class).byTicket(new TicketEntity(3L, 100));

        List<EventEntity> e = ctx.getBean(EventService.class).getEventsOrderById();
        System.out.println(e);

    }

}
