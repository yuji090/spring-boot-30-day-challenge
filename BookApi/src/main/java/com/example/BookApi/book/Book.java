package com.example.BookApi.book;

import lombok.Getter;
import lombok.Setter;

import java.util.PrimitiveIterator;

public class Book {

    // setter
    // getters
    @Setter
    @Getter
    private int id;

    @Getter
    @Setter
    private String title;

    @Setter
    @Getter
    private String author;

    @Setter
    @Getter
    private int price;

   public Book(){

    };

   public Book(int id,String title,String author, int price){
        this.id= id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

}
