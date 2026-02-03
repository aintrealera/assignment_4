package model;

public class PrintedBook extends BaseEntity {

    public PrintedBook(int id, String name, Author author) {
        super(id, name);
    }

    @Override
    public String getType() {
        return "PRINTED";
    }

    @Override
    public String getDescription() {
        return "Physical book";
    }
}
