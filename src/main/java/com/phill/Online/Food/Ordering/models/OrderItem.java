package com.phill.Online.Food.Ordering.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @ManyToOne
    private Food food;
    private int quantity;
    private long totalPrice;
    @ManyToMany
    private List<String> ingredients;
    private Date createddate;
}
