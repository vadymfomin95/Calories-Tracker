package com.caloriestracker.foodservice.repository;

import com.caloriestracker.foodservice.entity.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {
}
