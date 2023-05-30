package com.blackops.ditutorial.config;

import i18n.I18nSpanishService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class BeansConfig {

    @Profile("ES")
    @Bean("i18nService")
    public I18nSpanishService i18nSpanishService(){
        return new I18nSpanishService();
    }
}
