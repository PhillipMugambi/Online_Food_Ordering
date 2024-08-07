package com.phill.Online.Food.Ordering.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany
    private User owner;
private String name;
private String description;
private String cuisineType;
@OneToOne
private Address address;
@Embedded
private ContactInformation contactInformation;
private String openingHours;
@OneToMany(mappedBy="restaurant", cascade = CascadeType.ALL)
private List<Order> orders= new ArrayList<>();
}
