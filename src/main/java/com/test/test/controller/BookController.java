package com.test.test.controller;

import com.test.test.model.Book;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.test.test.service.BookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/book")

public class  BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @PostMapping()
    public Book createBook(@Valid  @RequestBody Book book){
        return bookService.saveBook(book);
    }

    @GetMapping("/{id}")
    public Book getBookWithId(@PathVariable Long id) {
        Book book = bookService.findBookWithId(id);
        if(book == null){
            System.out.println("this is null");
        }
        System.out.println(book);
        return book;
    }
}