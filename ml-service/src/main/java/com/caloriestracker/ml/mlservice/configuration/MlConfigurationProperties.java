package com.caloriestracker.ml.mlservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ml")
@Data
public class MlConfigurationProperties {

    private String model;

    private Integer maxCompletions;

    private Integer maxCompletionTokens;

    private Double temperature;

    private Api api = new Api();
}
