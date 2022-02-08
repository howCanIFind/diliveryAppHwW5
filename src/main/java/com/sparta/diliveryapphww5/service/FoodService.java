package com.sparta.diliveryapphww5.service;

import com.sparta.diliveryapphww5.dto.FoodRequestDto;
import com.sparta.diliveryapphww5.model.Food;
import com.sparta.diliveryapphww5.model.Restaurant;
import com.sparta.diliveryapphww5.repository.FoodRepository;
import com.sparta.diliveryapphww5.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class FoodService {
    private final FoodRepository foodRepository;
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository, RestaurantRepository restaurantRepository) {
        this.foodRepository = foodRepository;
        this.restaurantRepository = restaurantRepository;
    }

    //음식 등록.
    public List<Food> registerFood(FoodRequestDto requestDto, Long restaurantId) {
        List<Food> foodList = new ArrayList<>();
        Food food = new Food(requestDto, restaurantId);
        foodList.add(food);
        return foodRepository.saveAll(foodList);
    }

    //음식점의 모든 음식 조회
    public List<Food> getFoods(Long restaurantId) {

        return foodRepository.findAllByRestaurantId(restaurantId);
    }

}
