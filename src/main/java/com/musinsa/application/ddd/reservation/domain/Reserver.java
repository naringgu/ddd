package com.musinsa.application.ddd.reservation.domain;


import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.musinsa.application.ddd.member.domain.MemberId;

@Embeddable
public class Reserver {

    @Embedded
    private MemberId memberId;

    private String name;

    private String phoneNumber;

}
