package com.musinsa.application.ddd.loan.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class LoanId implements Serializable {

    @Column(name = "loan_id", nullable = false, unique = true)
    private Long id;
}
