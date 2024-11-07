package com.caloriestracker.mlservice.controller;

import com.caloriestracker.mlservice.dto.MlRequest;
import com.caloriestracker.mlservice.service.MlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/ml")
@RequiredArgsConstructor
public class MlController {

    private final MlService mlService;

    @PostMapping("/execute")
    public Map<String, Object> execute(@RequestBody MlRequest request) {
        return mlService.getData(request.getMessage());
    }
}
