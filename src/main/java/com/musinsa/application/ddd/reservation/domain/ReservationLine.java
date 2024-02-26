package com.musinsa.application.ddd.reservation.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.musinsa.application.ddd.book.domain.BookId;

@Embeddable
public class ReservationLine {
    @Embedded
    private BookId bookId;


}
