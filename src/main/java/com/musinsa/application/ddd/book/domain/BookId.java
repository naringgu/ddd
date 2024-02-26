package com.musinsa.application.ddd.book.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookId implements Serializable {

    @Column(name = "book_id", nullable = false, unique = true)
    private Long value;

    public BookId(Long value) {
        this.value = value;
    }

    public BookId() {

    }

    public Long getValue() {
        return value;
    }
}
