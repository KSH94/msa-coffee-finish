package com.example.msa.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Status {

    private Long id;
    private String orderHistory;

    @Builder
    public Status(String orderHistory) {
        this.orderHistory = orderHistory;
    }
}
