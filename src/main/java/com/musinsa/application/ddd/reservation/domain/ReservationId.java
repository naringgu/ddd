package com.musinsa.application.ddd.reservation.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class ReservationId implements Serializable {

    @Column(name = "reservation_id", nullable = false, unique = true)
    private Long id;
}
