# Library Management System (Refactored)

## Project Overview
This project is a console-based Library Management System implemented in Java.  
It is a refactored version of the previous library project (Assignment 3) and was updated to meet the requirements of Assignment 4 by applying SOLID principles and advanced OOP concepts.

The application uses a layered architecture and JDBC to interact with a relational database.

---

## Architecture
The project follows a layered architecture:

Controller → Service → Repository → Database

- **Controller**  
  Handles user input and application flow (console-based).
- **Service**  
  Contains business logic, validation, and exception handling.
- **Repository**  
  Responsible for database access using JDBC.
- **Database**  
  Stores application data in relational tables.

This separation ensures clean code, maintainability, and single responsibility for each layer.

---

## SOLID Principles

### Single Responsibility Principle (SRP)
Each class has a single responsibility:
- Controllers handle input
- Services handle business logic
- Repositories handle database operations

### Open/Closed Principle (OCP)
The system is open for extension but closed for modification through inheritance using an abstract base class.

### Liskov Substitution Principle (LSP)
Subclasses (`EBook`, `PrintedBook`) can be used wherever the base class (`BaseEntity`) is expected.

### Dependency Inversion Principle (DIP)
High-level modules depend on abstractions:
- `BookService` is an interface
- `CrudRepository<T>` is a generic interface implemented by repositories

---

## Advanced OOP Features

### Abstract Class and Polymorphism
`BaseEntity` is an abstract class that defines common fields and behavior.  
`Book`, `EBook`, and `PrintedBook` extend this class and override abstract methods.

### Composition
The `Book` class contains a `Category` object, demonstrating composition:

### Generics
A generic repository interface is used:
This allows reusable and type-safe CRUD operations.

### Lambdas
Lambda expressions are used for sorting collections, for example in `SortingUtils`.

### Reflection
Reflection is demonstrated in `ReflectionUtils`, where runtime class information is accessed and printed.

---

## Database
The project uses a relational database accessed via JDBC.

### Tables
- `books`
- `categories`

Books are linked to categories using a foreign key relationship.

### JDBC
- `PreparedStatement` is used for all database operations
- SQL injection is prevented through parameterized queries
- CRUD operations are implemented in the repository layer

---

## Exception Handling
Custom exceptions are used to handle application errors:
- `DatabaseOperationException`
- `InvalidInputException`
- `DuplicateResourceException`
- `ResourceNotFoundException`

Exceptions are thrown in the Service and Repository layers to ensure proper error handling.

---

## How to Run
1. Clone the repository
2. Configure the database connection in `DatabaseConnection.java`
3. Ensure the database schema is created
4. Run the `Main` class

The application runs as a console program.

---

## Conclusion
This project demonstrates the use of SOLID principles, layered architecture, JDBC, and advanced OOP concepts in Java.  
It fulfills all the requirements of Assignment 4 by refactoring an existing project into a clean, maintainable, and extensible system.
