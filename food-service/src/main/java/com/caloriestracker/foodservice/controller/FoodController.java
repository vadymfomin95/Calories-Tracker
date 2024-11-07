package com.caloriestracker.foodservice.controller;

import com.caloriestracker.foodservice.entity.Food;
import com.caloriestracker.foodservice.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/food")
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Food food) {
        foodService.save(food);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Food food) {
        foodService.update(id, food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        foodService.delete(id);
    }
}
