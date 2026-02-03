package service.interfaces;

import exception.InvalidInputException;
import model.Book;
import repository.BookRepository;

public interface BookService {
    void addBook(Book book);
    void deleteBook(int id);
    void updateBookName(int id, String name);

    void add(Book book1);
}
