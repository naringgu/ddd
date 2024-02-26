package com.musinsa.application.ddd.reservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musinsa.application.ddd.book.domain.Book;
import com.musinsa.application.ddd.book.domain.BookId;
import com.musinsa.application.ddd.book.service.BookService;
import com.musinsa.application.ddd.reservation.domain.Reservation;
import com.musinsa.application.ddd.reservation.domain.ReservationId;
import com.musinsa.application.ddd.reservation.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/{id}/cancel")
    public void cancelReservation(@PathVariable Long id) {
        reservationService.getReservation(new ReservationId(id));
    }
}
