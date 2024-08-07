package com.phill.Online.Food.Ordering.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.phill.Online.Food.Ordering.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    private USER_ROLE user_role;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    @JsonIgnore
    private List<Order>orders= new ArrayList<>();
    @ElementCollection
    private List<RestaurantDto>favourites=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Address>address= new ArrayList<>();


}
