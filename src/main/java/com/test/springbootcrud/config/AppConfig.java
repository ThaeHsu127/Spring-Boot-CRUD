package com.test.springbootcrud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties(prefix = "app.config")
public class AppConfig {

    private Long timeout;

    @Bean(name = "CustomizeRestTemplate")
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
