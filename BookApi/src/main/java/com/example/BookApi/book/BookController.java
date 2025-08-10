package com.example.BookApi.book;

import com.example.BookApi.book.dto.BookRequest;
import com.example.BookApi.book.dto.BookResponse;
import jakarta.validation.Valid;
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
    public void add(@Valid @RequestBody BookRequest bookRequest){
     //   books.add(book);
        bookService.addBook(bookRequest);
    }

    @GetMapping("/display")
    public List<BookResponse> show(){
        return bookService.getAllBooks();
    }

    @GetMapping("/display/{id}")
    public Book display(@PathVariable Long id){
        return bookService.showbyid(id);

    }
}
