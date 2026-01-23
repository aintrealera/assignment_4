package repository;

import exception.DatabaseOperationException;
import model.Book;
import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    // CREATE
    public void create(Book book) {
        String sql = "INSERT INTO books (name, type) VALUES (?, ?)";

        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, book.getName());
            ps.setString(2, book.getType());

            ps.executeUpdate();
            System.out.println(">>> BOOK SAVED: " + book.getName());

        } catch (Exception e) {
            e.printStackTrace();
            throw new DatabaseOperationException("Insert failed");
        }
    }

    // READ
    public List<String> getAll() {
        List<String> books = new ArrayList<>();
        String sql = "SELECT id, name, type FROM books";

        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                books.add(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("type")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new DatabaseOperationException("Select failed");
        }

        return books;
    }

    // DELETE
    public void delete(int id) {
        String sql = "DELETE FROM books WHERE id = ?";

        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println(">>> BOOK DELETED: id=" + id);

        } catch (Exception e) {
            e.printStackTrace();
            throw new DatabaseOperationException("Delete failed");
        }
    }
}
