package gos.andrey1986.homework.service;

import gos.andrey1986.homework.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> findBooksByAuthor(Long authorId);
}
