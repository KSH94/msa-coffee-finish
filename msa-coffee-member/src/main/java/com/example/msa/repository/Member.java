package com.example.msa.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor //파라미터가 없는 기본 생성자를 생성
public class Member {

    private Long id;
    private String name;
    private String phoneNumber;

    @Builder
    public Member(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
