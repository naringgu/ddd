package com.musinsa.application.ddd.book.domain;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;


import com.musinsa.application.ddd.loan.domain.Loan;
import com.musinsa.application.ddd.reservation.domain.Reservation;

@Entity
public class Book {

    @EmbeddedId
    private BookId id;
    private String title;
    private String author;
    private String isbn;
    private String company;
    private LocalDateTime createDate;
    @OneToMany(mappedBy = "book")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "book")
    private List<Loan> loans;

    @Enumerated(value = EnumType.STRING)
    private BookStatus status;

    public Book(BookId id, String title, String author, String isbn, String company, LocalDateTime createDate, List<Reservation> reservations, List<Loan> loans, BookStatus status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.company = company;
        this.createDate = createDate;
        this.reservations = reservations;
        this.loans = loans;
        this.status = status;
    }

    public Book() {

    }

    public BookId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCompany() {
        return company;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public BookStatus getStatus() {
        return status;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    private boolean isAvailableForLoan() {
        return this.status == BookStatus.AVAILABLE;
    }

    private boolean isOnLoan() {
        return this.status == BookStatus.ON_LOAN;
    }

    private void changeStatusOnLoan() { this.status = BookStatus.ON_LOAN; }

    private void changeStatusAvailable() { this.status = BookStatus.AVAILABLE; }
}
