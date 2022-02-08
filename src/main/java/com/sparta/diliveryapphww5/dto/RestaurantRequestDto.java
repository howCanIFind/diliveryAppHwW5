package com.sparta.diliveryapphww5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RestaurantRequestDto {

    // 레스토랑 이름.
    private String name;
    // 최소주문 가격.
    private Long minOrderPrice;
    // 기본 배달비.
    private Long deliveryFee;
}
