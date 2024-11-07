package com.caloriestracker.mlservice.service;

import com.caloriestracker.mlservice.configuration.MlConfigurationProperties;
import lombok.RequiredArgsConstructor;
import com.caloriestracker.mlservice.model.MlMessage;
import com.caloriestracker.mlservice.model.MlRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MlService {

    private final MlConfigurationProperties mlConfigurationProperties;

    private final RestTemplate restTemplate;

    public Map<String, Object> getData(String requestMessage) {
        List<MlMessage> messages = Collections.singletonList(new MlMessage("user", requestMessage));
        MlRequest request = MlRequest.builder()
                .model(mlConfigurationProperties.getModel())
                .messages(messages)
                .n(mlConfigurationProperties.getMaxCompletions())
                .maxCompletionTokens(mlConfigurationProperties.getMaxCompletionTokens())
                .temperature(mlConfigurationProperties.getTemperature())
                .build();
        return restTemplate.postForObject(mlConfigurationProperties.getApi().getUrl(), request, Map.class);
    }
}
