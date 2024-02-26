package com.musinsa.application.ddd.loan.domain;

import java.time.LocalDate;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.musinsa.application.ddd.book.domain.Book;
import com.musinsa.application.ddd.member.domain.Member;
import com.musinsa.application.ddd.member.domain.MemberId;

@Entity
public class Loan {

    @EmbeddedId
    private LoanId loanId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private LocalDate loanDate;
    private LoanStatus status;
}



