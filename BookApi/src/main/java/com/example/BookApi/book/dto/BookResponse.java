package com.example.BookApi.book.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookResponse {

    private String title;
    private String author;

    public BookResponse(){

    };

}
