package ru.learnup.pth.operasales.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
//@Import({LoggerConfig.class})
public class GenetalConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("msgs");
        messageSource.setDefaultEncoding("UTF-8");

        return messageSource;
    }

}
