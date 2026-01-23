package service;

import exception.InvalidInputException;
import model.Book;
import repository.BookRepository;

public class BookService {

    private BookRepository repository = new BookRepository();

    public void add(Book book) {
        if (book == null) {
            throw new InvalidInputException("Book cannot be null");
        }
        repository.create(book);
    }
}
