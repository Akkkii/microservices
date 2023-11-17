package com.order.service.common;

import com.order.service.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Order order;
    // amount amd transactionId is coming from Payment Class.
    private double amount;
    private String transactionId;
    private String message;
}