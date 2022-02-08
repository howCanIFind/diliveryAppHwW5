package com.sparta.diliveryapphww5.model;

import com.sparta.diliveryapphww5.dto.RestaurantRequestDto;
import com.sparta.diliveryapphww5.repository.RestaurantRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Restaurant {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 레스토랑 이름.
    @Column(nullable = false, unique = true)
    private String name;
    // 최소주문 가격.
    @Column(nullable = false)
    private Long minOrderPrice;
    // 기본 배달비.
    @Column(nullable = false)
    private Long deliveryFee;

//    @OneToMany
//    @JoinColumn(name = "RESTAURANT_ID")
//    private List<Food> foods = new ArrayList<>();

    public Restaurant(RestaurantRequestDto requestDto) {

        //입력값 Validation
        this.name = requestDto.getName();
        this.minOrderPrice = requestDto.getMinOrderPrice();
        this.deliveryFee = requestDto.getDeliveryFee();
    }


}
