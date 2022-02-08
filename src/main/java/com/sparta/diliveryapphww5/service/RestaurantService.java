package com.sparta.diliveryapphww5.service;

import com.sparta.diliveryapphww5.dto.RestaurantRequestDto;
import com.sparta.diliveryapphww5.model.Restaurant;
import com.sparta.diliveryapphww5.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant registerRestaurant(RestaurantRequestDto requestDto) {
        Restaurant restaurant = new Restaurant(requestDto);

        restaurantRepository.save(restaurant);

        return restaurant;
    }

    public List<Restaurant> getAllRestaurants() {

        return restaurantRepository.findAll();
    }

}
