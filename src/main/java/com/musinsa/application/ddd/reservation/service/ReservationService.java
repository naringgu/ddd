package com.musinsa.application.ddd.reservation.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.musinsa.application.ddd.reservation.domain.Reservation;
import com.musinsa.application.ddd.reservation.domain.ReservationId;
import com.musinsa.application.ddd.reservation.repository.ReservationRepository;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    @Transactional
    public void getReservation(ReservationId id) {
        Reservation reservation = reservationRepository.findById(id).orElse(new Reservation());
        reservation.cancel();
    }

}
