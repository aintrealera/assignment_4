package controller;

import model.Author;
import model.Book;
import model.Category;
import model.PrintedBook;
import service.interfaces.BookService;

public class LibraryController {

    public void run() {
        Author author = new Author(1, "Leo Tolstoy");

        Category Category = null;
        Book book1 = new Book(1, "War and Peace 1867 (print)", Category);
        Book book2 = new Book(2, "Anna Karenina 1878(print)", Category);

        BookService service = new BookService() {
            @Override
            public void addBook(Book book) {

            }

            @Override
            public void deleteBook(int id) {

            }

            @Override
            public void updateBookName(int id, String name) {

            }

            @Override
            public void add(Book book1) {

            }
        };
        service.add(book1);
        service.add(book2);

        System.out.println("Saved books to database");
    }
}
