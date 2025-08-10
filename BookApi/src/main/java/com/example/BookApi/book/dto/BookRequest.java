package com.example.BookApi.book.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

public class BookRequest {

    @Getter
    @Setter
    @NotBlank
    private String title;

    @Getter
    @Setter
    @NotBlank
    private String author;

    @Getter
    @Setter
    @Positive
    private Long price;

}
