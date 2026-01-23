package controller;

import model.Author;
import model.Book;
import model.EBook;
import model.PrintedBook;
import service.BookService;

public class LibraryController {

    public void run() {
        Author author = new Author(1, "George Orwell");

        Book book1 = new EBook(1, "1984 (ebook)", author);
        Book book2 = new PrintedBook(2, "1984 (print)", author);

        BookService service = new BookService();
        service.add(book1);
        service.add(book2);

        System.out.println("Saved books to database");
    }
}
