package com.sparta.diliveryapphww5.controller;

import com.sparta.diliveryapphww5.dto.FoodRequestDto;
import com.sparta.diliveryapphww5.model.Food;
import com.sparta.diliveryapphww5.model.Restaurant;
import com.sparta.diliveryapphww5.repository.RestaurantRepository;
import com.sparta.diliveryapphww5.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping("/restaurant/{restaurantId}/food/register")
    public List<Food> foodRegister(@RequestBody FoodRequestDto requestDto,
                                  @PathVariable Long restaurantId
    ) {
        return foodService.registerFood(requestDto, restaurantId);
    }

    @GetMapping("restaurant/{restaurantId}/foods")
    public List<Food> getFood(@PathVariable Long restaurantId) {
        return foodService.getFoods(restaurantId);
    }
}
