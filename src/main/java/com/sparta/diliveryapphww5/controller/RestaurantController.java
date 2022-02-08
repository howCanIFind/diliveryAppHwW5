package com.sparta.diliveryapphww5.controller;

import com.sparta.diliveryapphww5.dto.RestaurantRequestDto;
import com.sparta.diliveryapphww5.model.Restaurant;
import com.sparta.diliveryapphww5.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @PostMapping("/restaurant/register")
    public Restaurant register(@RequestBody RestaurantRequestDto requestDto) {

        return restaurantService.registerRestaurant(requestDto);
    }
    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurnats(RestaurantRequestDto requestDto) {
        return restaurantService.getAllRestaurants();
    }
}
