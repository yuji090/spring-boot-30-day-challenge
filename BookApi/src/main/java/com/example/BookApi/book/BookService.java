package com.example.BookApi.book;


import com.example.BookApi.book.dto.BookRequest;
import com.example.BookApi.book.dto.BookResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    List<Book> books = new ArrayList<>();

    @Autowired
    private BookRepository bookRepository;

    public void addBook(BookRequest bookRequest){
        Book book = new Book();

        //Book book = modelMapper.map(bookRequest, Book.class);

        book.setTitle(bookRequest.getTitle());
        book.setAuthor(bookRequest.getAuthor());
        book.setPrice(bookRequest.getPrice());
        bookRepository.save(book);
    }

    public List<BookResponse> getAllBooks() {
        List<BookResponse> bop = new ArrayList<>();
        List<Book> bk = bookRepository.findAll();
        for(Book b : bk){
            BookResponse ak = new BookResponse();
            ak.setAuthor(b.getAuthor());
            ak.setTitle(b.getTitle());
            bop.add(ak);
        }
        return bop;

    }

    public Book showbyid(Long id){

       return bookRepository.findById(id).orElse(null);
    }

}
