package com.domain;

import jakarta.persistence.*;

@Entity
public class Locker extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "locker",  fetch = FetchType.LAZY)
    private Member member;  //읽기 전용
}
