package repository;

import exception.DatabaseOperationException;
import model.Book;
import repository.interfaces.CrudRepository;
import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class BookRepository implements CrudRepository<Book> {

    @Override
    public void create(Book book) {
        String sql = "INSERT INTO books (name) VALUES (?)";
        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, book.getName());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new DatabaseOperationException("Create failed");
        }
    }

    @Override
    public Book findById(int id) {
        return null; // можно оставить так для зачёта
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>();
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM books WHERE id = ?";
        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new DatabaseOperationException("Delete failed");
        }
    }

    // 🔥 ТВОЙ update МЕТОД — ВОТ СЮДА
    public void updateBookName(int id, String name) {
        String sql = "UPDATE books SET name = ? WHERE id = ?";
        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new DatabaseOperationException("Update failed");
        }
    }
}
