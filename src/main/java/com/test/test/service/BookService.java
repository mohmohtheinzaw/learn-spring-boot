package com.test.test.service;

import com.test.test.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.test.repository.BookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookWithId(Long id) {
        return bookRepository.findById(id).get();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // public Book updateBook
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
