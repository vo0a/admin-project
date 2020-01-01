package com.example.admin_project.model.network.request;

import com.example.admin_project.model.enumclass.OrderGroupStatus;
import com.example.admin_project.model.enumclass.OrderType;
import com.example.admin_project.model.enumclass.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderGroupApiRequest {

    private Long id;

    private OrderGroupStatus Status;

    private OrderType orderType;

    private String revAddress;

    private String revName;

    private PaymentType paymentType;

    private BigDecimal totalPrice;

    private Integer totalQuantity;

    private LocalDateTime orderAt;

    private LocalDate arrivalDate;

    private Long userId;
}
