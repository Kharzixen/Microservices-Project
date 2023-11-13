package com.kharzixen.ordervalidationservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrderItem {
    private Long id;
    private String productId;
    private int quantity;
    private Order order;
}