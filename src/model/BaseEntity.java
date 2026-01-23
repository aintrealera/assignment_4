package model;

public abstract class BaseEntity {

    protected int id;
    protected String name;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getType();

    public abstract double getMonthlyCost();

    public String info() {
        return id + ": " + name + " (" + getType() + ")";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}