package com.company.view.Impl;

import com.company.domain.Food;
import com.company.view.FoodView;

import java.util.List;
public class FoodViewImpl implements com.company.view.FoodView {
    /**
     * 查看食物信息
     * @param businessId
     * @return
     */
    @Override
    public List<Food> showFoodList(Integer businessId) {
        return null;
    }

    /**
     * 添加食物信息
     * @param businessId
     */
    @Override
    public void saveFood(Integer businessId) {

    }

    /**
     * 修改食物信息
     * @param businessId
     */
    @Override
    public void updateFood(Integer businessId) {

    }

    /**
     * 删除食物信息
     * @param businessId
     */
    @Override
    public void removeFood(Integer businessId) {

    }
}
