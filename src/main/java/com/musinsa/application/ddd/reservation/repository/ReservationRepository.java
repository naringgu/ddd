package com.musinsa.application.ddd.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musinsa.application.ddd.book.domain.Book;
import com.musinsa.application.ddd.book.domain.BookId;
import com.musinsa.application.ddd.reservation.domain.Reservation;
import com.musinsa.application.ddd.reservation.domain.ReservationId;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, ReservationId> {

}