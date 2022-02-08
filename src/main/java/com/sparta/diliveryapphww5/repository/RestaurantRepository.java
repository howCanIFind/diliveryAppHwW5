package com.sparta.diliveryapphww5.repository;

import com.sparta.diliveryapphww5.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
