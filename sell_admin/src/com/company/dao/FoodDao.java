package com.company.dao;

import com.company.domain.Food;

import java.util.List;

public interface FoodDao {
    List<Food> listFoodByBusinessId(Integer businessId);

    int saveFood(Food food);

    int updateFood(Food food);

    int removeFood(Integer foodId);

    Food getFoodById(Integer foodId);
}
