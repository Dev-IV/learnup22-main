package ru.learnup.pth.operasales.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import ru.learnup.pth.operasales.repository.entities.TicketEntity;
import ru.learnup.pth.operasales.repository.interfaces.TicketRepository;
import ru.learnup.pth.operasales.services.interfaces.Logger;

@Service
@Data
@AllArgsConstructor
public class TicketService implements ApplicationContextAware {

    Logger logger;
    ApplicationContext ctx;
    TicketRepository repository;

    public void byTicket(TicketEntity t) {
        repository.save(t);
    }

    public void returnTicket(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
