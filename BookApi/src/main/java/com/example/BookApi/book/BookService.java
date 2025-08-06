package com.example.BookApi.book;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book showbyid(int id){
        for(Book b: books){
            if(b.getId()==id){
                return b;
            }

        }
        return null;
    }

}
