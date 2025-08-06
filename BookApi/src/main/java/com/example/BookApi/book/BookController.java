package com.example.BookApi.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

  // List<Book> books = new ArrayList<>();

    @PostMapping("/add")
    public void add(@RequestBody Book book){
     //   books.add(book);
        bookService.addBook(book);
    }

    @GetMapping("/display")
    public List<Book> show(){
        return bookService.getAllBooks();
    }

    @GetMapping("/display/{id}")
    public Book display(@PathVariable int id){
        return bookService.showbyid(id);

    }
}
