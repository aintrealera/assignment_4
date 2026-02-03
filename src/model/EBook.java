package model;

public class EBook extends BaseEntity {

    public EBook(int id, String name) {
        super(id, name);
    }

    @Override
    public String getType() {
        return "EBOOK";
    }

    @Override
    public String getDescription() {
        return "Digital book";
    }
}

