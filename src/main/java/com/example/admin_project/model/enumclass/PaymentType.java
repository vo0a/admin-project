package com.example.admin_project.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentType {
    CARD(0, "카드", "카드 결제"),
    CASH(1, "현금", "현금 결제"),
    BANK_TRANSFER(2, "계좌이체", "계좌이체"),
    CHECK_CARD(3, "체크카드", "체크카드 결제");

    private Integer id;
    private String title;
    private String description;
}
