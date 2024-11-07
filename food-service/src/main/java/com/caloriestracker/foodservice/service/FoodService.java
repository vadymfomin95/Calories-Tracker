package com.caloriestracker.foodservice.service;

import com.caloriestracker.foodservice.entity.Food;
import com.caloriestracker.foodservice.repository.FoodRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public void save(Food food) {
        foodRepository.save(food);
    }

    @Transactional
    public void update(Long id, Food food) {
        foodRepository.findById(id).ifPresent(saved -> {
            saved.setBrand(food.getBrand());
            saved.setName(food.getName());
            saved.setDescription(food.getDescription());
            saved.setCalories(food.getCalories());
            saved.setFat(food.getFat());
            saved.setProtein(food.getProtein());
            saved.setCarbs(food.getCarbs());

            foodRepository.save(saved);
        });
    }

    public void delete(Long id) {
        foodRepository.deleteById(id);
    }

    public List<Food> getAll() {
        return (List<Food>) foodRepository.findAll();
    }
}
