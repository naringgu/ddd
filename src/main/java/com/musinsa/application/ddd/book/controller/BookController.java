package com.musinsa.application.ddd.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musinsa.application.ddd.book.domain.Book;
import com.musinsa.application.ddd.book.domain.BookId;
import com.musinsa.application.ddd.book.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public Book getBookInfo(@PathVariable Long id) {
        return bookService.getBookInfo(new BookId(id));
    }
}
