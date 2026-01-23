package model;

public class Author {

    private int id;
    private String fullName;

    public Author(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }
}
