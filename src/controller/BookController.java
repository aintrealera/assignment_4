package controller;

import model.Book;
import model.Category;
import service.BookServiceImpl;
import service.interfaces.BookService;

import java.util.Scanner;

public class BookController {

    private final BookService service = new BookService() {
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
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Enter book name:");
        String name = scanner.nextLine();

        Book book = new Book(0, name, new Category(1, "Default"));
        service.addBook(book);
    }
}

