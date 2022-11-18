package gos.andrey1986.homework.service.impl;

import gos.andrey1986.homework.model.Book;
import gos.andrey1986.homework.repository.BookRepository;
import gos.andrey1986.homework.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findBooksByAuthor(Long authorId) {
        return bookRepository.findBooksByAuthor_Id();
    }
}
