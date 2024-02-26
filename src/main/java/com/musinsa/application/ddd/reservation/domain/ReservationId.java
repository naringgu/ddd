package com.musinsa.application.ddd.reservation.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReservationId implements Serializable {

    @Column(name = "reservation_id", nullable = false, unique = true)
    private Long id;

    public ReservationId(Long id) {
        this.id = id;
    }

    public ReservationId() {

    }

    public Long getId() {
        return id;
    }
}
