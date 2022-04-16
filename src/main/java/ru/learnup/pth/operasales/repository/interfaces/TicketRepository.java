package ru.learnup.pth.operasales.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.learnup.pth.operasales.repository.entities.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Long> {
}
