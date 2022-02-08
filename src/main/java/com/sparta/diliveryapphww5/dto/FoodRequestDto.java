package com.sparta.diliveryapphww5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FoodRequestDto {

    //음식 이름.
    private String name;
    //음식 가격.
    private Long price;
}
