package model;

public class EBook extends Book {

    public EBook(int id, String name, Author author) {
        super(id, name, author);
    }

    public String getType() {
        return "EBook";
    }

    public double getMonthlyCost() {
        return 1.0;
    }
}
