package com.sparta.diliveryapphww5.model;

import com.sparta.diliveryapphww5.dto.FoodRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Food {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String foodName;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false)
    private Long restaurantId;

    public Food(FoodRequestDto requestDto, Long restaurantId) {
        this.foodName = requestDto.getName();
        this.price = requestDto.getPrice();
        this.restaurantId = restaurantId;
    }
}
