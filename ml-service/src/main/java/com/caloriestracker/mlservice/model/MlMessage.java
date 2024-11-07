package com.caloriestracker.mlservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MlMessage {

    private String role;

    private String content;
}
