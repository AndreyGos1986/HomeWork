package gos.andrey1986.homework.controller;

import gos.andrey1986.homework.model.Book;
import gos.andrey1986.homework.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private  final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping ("{id}")
    public ResponseEntity <List<Book>> getAllBooksByAuthor (Long authorId){
        return ResponseEntity.ok(bookService.findBooksByAuthor(authorId));
    }
}
