package model;

public class Book extends BaseEntity {
    private Category category;

    public Book(int id, String name, Category category) {
        super(id, name);
        this.category = category;
    }

    @Override
    public String getType() {
        return "BOOK";
    }

    @Override
    public String getDescription() {
        return "Book in category " + category.getName();
    }
}
