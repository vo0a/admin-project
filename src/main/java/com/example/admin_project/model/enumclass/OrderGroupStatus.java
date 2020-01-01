package com.example.admin_project.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderGroupStatus {
    REGISTERED(0, "등록", "결제 완료 상태"),
    UNREGISTERED(1, "해지", "결제 취소 상태"),
    WAITING(2, "검수(대기)", "결제 대기 상태");

    private Integer id;
    private String title;
    private String description;
}
