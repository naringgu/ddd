package com.musinsa.application.ddd.reservation.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    private LocalDateTime reservationDate;
    @Enumerated(value = EnumType.STRING)
    private ReservationStatus status;

    public Reservation(ReservationId reservationId, Member member, Book book, LocalDateTime reservationDate, ReservationStatus status) {
        this.reservationId = reservationId;
        this.member = member;
        this.book = book;
        this.reservationDate = reservationDate;
        this.status = status;
    }

    public Reservation() {

    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }


    public void cancel() {
        this.status = ReservationStatus.CANCELED;
    }

}
