package com.sparta.diliveryapphww5.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class FoodList {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;



}
