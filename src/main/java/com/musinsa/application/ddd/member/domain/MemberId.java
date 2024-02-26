package com.musinsa.application.ddd.member.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class MemberId implements Serializable {

    @Column(name = "member_id", nullable = false, unique = true)
    private Long id;
}
