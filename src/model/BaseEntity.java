package model;

public abstract class BaseEntity {
    private int id;
    private String name;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getType();
    public abstract String getDescription();

    public String display() {
        return id + ": " + name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}
