package com.phill.Online.Food.Ordering.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private User customer;
    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;
    private Long totalAmount;
    private String orderStatus;
    private Date createdAt;
    @ManyToOne
    private Address deliveredAt;
    @OneToMany
    private List<OrderItem> items;
    //private String paymentmethod;
    private int totalItem;
    private int price;
}
