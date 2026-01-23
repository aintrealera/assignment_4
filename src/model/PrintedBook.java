package model;

public class PrintedBook extends Book {

    public PrintedBook(int id, String name, Author author) {
        super(id, name, author);
    }

    public String getType() {
        return "PrintedBook";
    }

    public double getMonthlyCost() {
        return 2.5;
    }
}
