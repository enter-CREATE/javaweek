package com.company.view;

import com.company.domain.Food;

import java.util.List;

public interface FoodView {
    List<Food> showFoodList(Integer businessId);

    void saveFood(Integer businessId);

    void updateFood(Integer businessId);

    void removeFood(Integer businessId);
}
