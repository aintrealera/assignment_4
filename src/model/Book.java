package model;

public abstract class Book extends BaseEntity {

    protected Author author;

    public Book(int id, String name, Author author) {
        super(id, name);
        this.author = author;
    }
}
