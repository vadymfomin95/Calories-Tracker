package com.caloriestracker.ml.mlservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MlConfiguration {

    @Bean
    public RestTemplate restTemplate(MlConfigurationProperties mlConfigurationProperties) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((request, body, execution) -> {
            request.getHeaders().add("Authorization", "Bearer " + mlConfigurationProperties.getApi().getKey());
            return execution.execute(request, body);
        });
        return restTemplate;
    }
}
