package com.sparta.diliveryapphww5.repository;

import com.sparta.diliveryapphww5.model.Food;
import com.sparta.diliveryapphww5.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByRestaurantId(Long restaurantId);
}
