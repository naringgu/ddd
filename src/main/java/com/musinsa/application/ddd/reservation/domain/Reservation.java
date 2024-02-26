package com.musinsa.application.ddd.reservation.domain;

import java.time.LocalDate;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.musinsa.application.ddd.book.domain.Book;
import com.musinsa.application.ddd.member.domain.Member;


@Entity
public class Reservation {

    @EmbeddedId
    private ReservationId reservationId;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private LocalDate reservationDate;
    @Enumerated(value = EnumType.STRING)
    private ReservationStatus status;

    public void cancel() {

        this.status = ReservationStatus.CANCELED;
    }

}
