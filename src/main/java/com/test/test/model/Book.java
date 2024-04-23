package com.test.test.model;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "`createdAt`")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updatedAt")
    @UpdateTimestamp
    private Date updatedOn;


    // Constructors, Getters, and Setters
    public Book() {
    }

//    public Book(Long id, String title, String author) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public Date getCreatedAt(){
        return createdAt;
    }

    public Date getUpdatedOn(){
        return updatedOn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}




