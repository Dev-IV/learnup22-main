package ru.learnup.pth.operasales.config;

import org.springframework.context.annotation.Bean;
import ru.learnup.pth.operasales.services.loggers.ConsoleLogger;
import ru.learnup.pth.operasales.services.interfaces.Logger;

//@Configuration
public class LoggerConfig {
    @Bean
    public Logger logger() {
        return new ConsoleLogger();
    }
}
