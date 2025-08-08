package com.example.BookApi.book;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.PrimitiveIterator;
@Entity
@Table(name = "books")
public class Book {

    // setter
    // getters
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    private String title;

    @Setter
    @Getter
    private String author;

    @Setter
    @Getter
    private Long price;

   public Book(){

    };

   public Book(int id,String title,String author, Long price){
        this.id= id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

}
