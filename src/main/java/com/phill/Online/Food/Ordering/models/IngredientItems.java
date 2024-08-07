package com.phill.Online.Food.Ordering.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class IngredientItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
