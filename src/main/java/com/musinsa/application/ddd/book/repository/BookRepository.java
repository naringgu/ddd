package com.musinsa.application.ddd.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musinsa.application.ddd.book.domain.Book;
import com.musinsa.application.ddd.book.domain.BookId;

@Repository
public interface BookRepository extends JpaRepository<Book, BookId> {

}