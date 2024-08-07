package com.phill.Online.Food.Ordering.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Long price;
    @ManyToOne
    private Category category;
    @Column(length = 1000)
    @ElementCollection
    private List<String>images;
    private boolean available;
    @ManyToOne
    private Restaurant restaurant;
    private boolean isVegeterian;
    private boolean isSeasonal;
    private List<IngredientItems>ingridients=new ArrayList<>();

}