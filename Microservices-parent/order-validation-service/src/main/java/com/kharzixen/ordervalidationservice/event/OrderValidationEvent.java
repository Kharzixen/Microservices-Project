package com.kharzixen.ordervalidationservice.event;

import com.kharzixen.ordervalidationservice.model.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderValidationEvent {
    private Order order;
    private String message;
    private ZonedDateTime eventPublishedDate;
}