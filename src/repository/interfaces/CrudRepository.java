package repository.interfaces;

import java.util.List;

public interface CrudRepository<T> {
    void create(T item);
    T findById(int id);
    List<T> findAll();
    void delete(int id);
}
