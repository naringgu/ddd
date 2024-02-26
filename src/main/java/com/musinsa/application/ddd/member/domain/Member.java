package com.musinsa.application.ddd.member.domain;

import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.musinsa.application.ddd.loan.domain.Loan;
import com.musinsa.application.ddd.reservation.domain.Reservation;

@Entity
public class Member {

    @EmbeddedId
    private MemberId memberId;

    private String name;
    private String phoneNumber;

    @OneToMany(mappedBy = "member")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "member")
    private List<Loan> loans;

}



