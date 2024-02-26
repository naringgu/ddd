package com.musinsa.application.ddd.book.service;

import org.springframework.stereotype.Service;

import com.musinsa.application.ddd.book.domain.Book;
import com.musinsa.application.ddd.book.domain.BookId;
import com.musinsa.application.ddd.book.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookInfo(BookId id) {
        return bookRepository.findById(id).orElse(new Book());
    }
}
