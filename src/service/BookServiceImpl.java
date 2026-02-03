package service;

import model.Book;
import repository.BookRepository;
import service.interfaces.BookService;

public class BookServiceImpl implements BookService {

    private final BookRepository repository = new BookRepository();

    @Override
    public void addBook(Book book) {
        repository.create(book);
    }

    @Override
    public void deleteBook(int id) {
        repository.delete(id);
    }

    @Override
    public void updateBookName(int id, String name) {
        repository.updateBookName(id, name);
    }

    @Override
    public void add(Book book1) {

    }
}

