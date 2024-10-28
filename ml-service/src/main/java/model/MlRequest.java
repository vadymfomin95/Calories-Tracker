package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class MlRequest {

    private String model;

    private List<MlMessage> messages;

    private int n;

    @JsonProperty("max_completion_tokens")
    private int maxCompletionTokens;

    private double temperature;
}
